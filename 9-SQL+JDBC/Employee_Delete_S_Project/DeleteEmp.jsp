<!-- Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
<%@ page import="java.sql.*" %>
<%
    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;
    int grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        // Delete records where name starts with 'S'
        String deleteQuery = "DELETE FROM Emp WHERE Emp_Name LIKE 'S%'";
        pst = conn.prepareStatement(deleteQuery);
        int deleted = pst.executeUpdate();

        out.println("<h3>" + deleted + " record(s) deleted where name started with 'S'</h3><br>");

        // Now display remaining employees
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Salary Report</h2>");

        while(rs.next()){
            int salary = rs.getInt("Basicsalary");
            grandTotal += salary;

            out.println("<hr>");
            out.println("Emp_No : " + rs.getInt("Emp_NO") + "<br>");
            out.println("Emp_Name : " + rs.getString("Emp_Name") + "<br>");
            out.println("Basic : " + salary + "<br>");
            out.println("<hr>");
        }

        out.println("<h3>Grand Total Salary: " + grandTotal + "</h3>");

    } catch(Exception e){
        out.println("Error: " + e.getMessage());
    } finally {
        if(rs != null) try { rs.close(); } catch(Exception e) {}
        if(stmt != null) try { stmt.close(); } catch(Exception e) {}
        if(pst != null) try { pst.close(); } catch(Exception e) {}
        if(conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
