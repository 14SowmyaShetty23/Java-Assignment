/*8b. Read all the existing records from the table coffee which is from the database test and update an 
existing coffee product  in the table with its id. [Create a table coffee with fields 
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively*/

<%@ page import="java.sql.*" %>
<%
    
    final String JDBC_URL = "jdbc:mysql://localhost:3306/test";
    final String DB_USER  = "root";      
    final String DB_PASS  = "";          

   
    String idStr        = request.getParameter("id");
    String newName      = request.getParameter("coffee_name");
    String newPriceStr  = request.getParameter("price");

    Connection conn = null; PreparedStatement ps = null;
    Statement st = null; ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

        
        if (idStr!=null && newName!=null && newPriceStr!=null) {
            int id   = Integer.parseInt(idStr);
            float pr = Float.parseFloat(newPriceStr);

            String sql = "UPDATE coffee SET coffee_name=?, price=? WHERE id=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setFloat (2, pr);
            ps.setInt   (3, id);

            int rows = ps.executeUpdate();
            if (rows>0)
                out.println("<p style='color:green;'>Record updated!</p>");
            else
                out.println("<p style='color:red;'>ID not found.</p>");
        }

        
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM coffee ORDER BY id");

        out.println("<h3>Coffee Table</h3>");
        out.println("<table border='1' cellpadding='8'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");
        while (rs.next()) {
            out.println("<tr><td>"+rs.getInt("id")+"</td><td>"+
                        rs.getString("coffee_name")+"</td><td>"+
                        rs.getFloat("price")+"</td></tr>");
        }
        out.println("</table>");

    } catch(Exception e) {
        out.println("<p style='color:red;'>Error: "+e.getMessage()+"</p>");
    } finally {
        try{if(rs!=null)rs.close();}catch(Exception e){}
        try{if(st!=null)st.close();}catch(Exception e){}
        try{if(ps!=null)ps.close();}catch(Exception e){}
        try{if(conn!=null)conn.close();}catch(Exception e){}
    }
%>
