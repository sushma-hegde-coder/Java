<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
 <form action="Register">
   <table>
      <tr>
        <td><label>Name</label></td>
        <td><input type="text" name="name"/></td>
      </tr>
      <tr>
        <td><label>UserName</label></td>
        <td><input type="text" name="un"/></td>
       </tr>
       <tr>
         <td><label>Password</label></td>
         <td><input type="password" name="pw"/></td>
       </tr>
       <tr>
         <td><label>Confirm password</label></td>
         <td><input type="password" name="cpw"/></td>
       </tr>
       <tr>
         <td><input type="submit"/></td>
       </tr>
      
   </table>
 </form>
</body>
</html>