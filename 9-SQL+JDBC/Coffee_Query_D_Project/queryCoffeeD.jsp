<!--9b. Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively-->
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Coffee & Show “D” Coffees</title>
</head>
<body>

<h2>Add Coffee Product</h2>
<form action="insertCoffee.jsp" method="post">
    <label>
        ID:
        <input type="number" name="id" required>
    </label><br><br>

    <label>
        Coffee Name:
        <input type="text" name="coffee_name" required>
    </label><br><br>

    <label>
        Price:
        <input type="number" step="0.01" name="price" required>
    </label><br><br>

    <input type="submit" value="Add Coffee">
</form>

<hr>

<%
    // Database connection parameters
    final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    final String DB_USER = "root"; // Change as needed
    final String DB_PASS = "";     // Change as needed

    String idStr = request.getParameter("id");
    String name = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

            // Insert new coffee if form submitted
            if (idStr != null && name != null && priceStr != null) {
                int id = Integer.parseInt(idStr);
                float price = Float.parseFloat(priceStr);

                String sqlInsert = "INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)";
                try (PreparedStatement ps = con.prepareStatement(sqlInsert)) {
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setFloat(3, price);
                    ps.executeUpdate();
                    out.println("<p style='color:green;'>Coffee added successfully!</p>");
                } catch (SQLIntegrityConstraintViolationException e) {
                    out.println("<p style='color:red;'>ID already exists — please choose another.</p>");
                }
            }

            // Select coffees with names starting with 'D'
            String sqlSelect = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%' ORDER BY coffee_name";
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(sqlSelect)) {

                out.println("<h3>Coffees Whose Name Begins with 'D'</h3>");
                out.println("<table border='1' cellpadding='8'>");
                out.println("<tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

                boolean hasResults = false;
                while (rs.next()) {
                    hasResults = true;
                    out.println("<tr><td>" + rs.getInt("id") + "</td><td>"
                            + rs.getString("coffee_name") + "</td><td>"
                            + rs.getFloat("price") + "</td></tr>");
                }
                if (!hasResults) {
                    out.println("<tr><td colspan='3' align='center'>No coffees starting with 'D'</td></tr>");
                }
                out.println("</table>");
            }

        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>

</body>
</html>
