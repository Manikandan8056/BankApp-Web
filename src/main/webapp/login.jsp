
<html>
<body>
<h2>Login Page</h2>

<%
String message = request.getParameter("message");
if (message != null){
    out.println(message);
}
%>

<form action="LoginServlet">
Enter the email:
<input type="email" name="email" placeholder="Email" required />
<br/>

Enter the password:
<input type="password" name="password" required />
<br/>

<button type="submit">Login</button>
</form>
</body>
</html>
