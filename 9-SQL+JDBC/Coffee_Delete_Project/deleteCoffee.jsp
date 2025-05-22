<!--9a. Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively-->
<%@ page import="java.sql.*" %>
<%
   
    final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    final String DB_USER  = "root";   
    final String DB_PASS  = "";       
   

    String idStr = request.getParameter("id");   

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");                
        try (Connection con = DriverManager.getConnection(
                JDBC_URL, DB_USER, DB_PASS)) {

            
            if (idStr != null && !idStr.isEmpty()) {
                int id = Integer.parseInt(idStr);

                String delSQL = "DELETE FROM coffee WHERE id = ?";
                try (PreparedStatement ps = con.prepareStatement(delSQL)) {
                    ps.setInt(1, id);
                    int rows = ps.executeUpdate();

                    if (rows > 0) {
                        out.println("<p style='color:green;'>Coffee with ID "
                                    + id + " deleted.</p>");
                    } else {
                        out.println("<p style='color:red;'>ID "
                                    + id + " not found.</p>");
                    }
                }
            }

           
            String selSQL = "SELECT * FROM coffee ORDER BY id";
            try (Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(selSQL)) {

                out.println("<h3>Remaining Coffee Products</h3>");
                out.println("<table border='1' cellpadding='8'>");
                out.println("<tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

                boolean any = false;
                while (rs.next()) {
                    any = true;
                    out.println("<tr><td>" + rs.getInt("id") + "</td><td>"
                                + rs.getString("coffee_name") + "</td><td>"
                                + rs.getFloat("price") + "</td></tr>");
                }
                if (!any) {
                    out.println("<tr><td colspan='3' align='center'>No records left</td></tr>");
                }
                out.println("</table>");
            }
        }

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    }
%>

<p><a href="deleteCoffee.html">	Back to Delete Form</a></p>
