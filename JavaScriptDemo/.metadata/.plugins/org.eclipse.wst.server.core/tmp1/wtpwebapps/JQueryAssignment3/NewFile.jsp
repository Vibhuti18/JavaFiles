
<% 
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
if(name.equalsIgnoreCase("John") && pwd.equalsIgnoreCase("Test")){
	out.print("You are logged in as administrator");
}
else{
	out.print("You are not logged in as Administrator. You do not have rights to make any changes in the profile settings");
}

%>