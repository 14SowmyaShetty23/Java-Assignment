<!-- Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head><title>Update Employee</title></head>
<body>
<h2>Update Employee Details</h2>
<form action="updateEmpAction.jsp" method="post">
  Emp No (to update): <input type="text" name="empno" required><br><br>
  New Emp Name: <input type="text" name="empname" required><br><br>
  New Basic Salary: <input type="text" name="basicsalary" required><br><br>
  <input type="submit" value="Update Employee">
</form>

<br><br>
<a href="viewEmp.jsp">← Back to Employee List</a>
</body>
</html>
