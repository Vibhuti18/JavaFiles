/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.39
 * Generated at: 2018-01-16 06:07:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class viewbooking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"css/bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("\t\r\n");
      out.write("  $('tr button').click(function(){\r\n");
      out.write("\t  \r\n");
      out.write("\t  var id = $(this).parent().parent().children(\":first\").text();\r\n");
      out.write("\t  \r\n");
      out.write("\t//  alert(id);\r\n");
      out.write("\t\r\n");
      out.write("\t   $.ajax(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttype:\"GET\",\r\n");
      out.write("\t\t\t\t\t\t\turl:\"delete_booking.jsp\",\r\n");
      out.write("\t\t\t\t\t\t\tdata:{loc:id},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\tsuccess:function()\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t//alert('hi');\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t location.reload();\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t/* for(var i=0;i<data.length;i++)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(data[i]);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#roomid\").append(\"<option>\"+data[i]+\"</option>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} */\r\n");
      out.write("\t\t\t\t \t\t\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\terror:function(data,status,error)\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t//alert(data[1]);\r\n");
      out.write("\t\t\t\t\t\t\talert(\"Error occured in ajax\"+error+\":\"+status);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}); \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"PSLLogo.jpg\" width=\"70px\" height=\"70px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a class=\"brand\" href=\"adminUser.jsp\">\r\n");
      out.write("\t\t\t\tRoom Booking Calendar\t\t\t\t\r\n");
      out.write("\t\t\t</a>\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a href=\"adminUser.jsp\" class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-chevron-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\tBack to Homepage\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div><!--/.nav-collapse -->\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div> <!-- /container -->\r\n");
      out.write("\t\t<div class=\"right\">\r\n");
      out.write("\t\t<img alt=\"\" src=\"kc-logo-header (1).png\" width=\"70px\" height=\"70px\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div> <!-- /navbar-inner -->\r\n");
      out.write("\t\r\n");
      out.write("</div> <!-- /navbar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"account-container register\"  align=\"center\" style=\"border: medium;\">\r\n");
      out.write("\t\r\n");
      out.write("<div class=\"content clearfix\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("<div class=\"login-fields\">\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

String loc=request.getParameter("loc");
final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
final String DB_URL = "jdbc:mysql://localhost:3306/rbcdatabase1";
List<String> list =new ArrayList<String>();





String dd="";
Connection conn = null;
Statement stmt = null;
try{
   //STEP 2: Register JDBC driver
   Class.forName("com.mysql.jdbc.Driver");
   Long userid= (Long)session.getAttribute("userid");
   //STEP 3: Open a connection
   System.out.println("Connecting to database...");
   conn = (Connection) DriverManager.getConnection(DB_URL,"root","root");

   //STEP 4: Execute a query
   System.out.println("Creating statement...");
   stmt = (Statement) conn.createStatement();
   Statement stmt1 = (Statement) conn.createStatement();
   String sql;
   sql = "SELECT * from training_table where employee_id='"+userid+"' ";
   
   ResultSet rs = stmt.executeQuery(sql);
   ResultSet rs1=null;
   ResultSet rs2;
   String roomname="";
   String location="";
   //STEP 5: Extract data from result set
   
   
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </br>\r\n");
      out.write("\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("\r\n");
      out.write("<h1>BOOKINGS:</h1>\r\n");
      out.write(" \r\n");
      out.write("<table  border=\"8px\" cellpadding=\"12px\" bordercolor=\"#444\"  >   \r\n");
      out.write("   <tr >\r\n");
      out.write("<td style=\"display:none;\">Training ID</td>\r\n");
      out.write("<td>Room Name</td>\r\n");
      out.write("<td>Location</td>\r\n");
      out.write("<td>Start Date</td>\r\n");
      out.write("<td>End Date</td>\r\n");
      out.write("<td>Training Type</td>\r\n");
      out.write("<td>Start time</td>\r\n");
      out.write("<td>End time</td>\r\n");
      out.write("<td>Owner name</td>\r\n");
      out.write("<td>Training name</td>\r\n");
      out.write("\r\n");
      out.write("<td>-------</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


   while(rs.next()){
      //Retrieve by column name
	
	
	
	
  
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <TR>\r\n");
      out.write("                <TD style=\"display:none;\"> ");
      out.print( rs.getString(1) );
      out.write("</td>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("   ");

String sql1 = "SELECT  room_name,location from room_table where room_id='"+rs.getString(3)+"' ";
   
   rs1 = stmt1.executeQuery(sql1);
   while(rs1.next())
	   
   {
	   
	   roomname=rs1.getString(1);
	   location=rs1.getString(2);
   }
   
   
   
      out.write("             \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <TD > ");
      out.print( roomname );
      out.write("</TD>\r\n");
      out.write("                <TD> ");
      out.print( location );
      out.write("</TD>\r\n");
      out.write("                <TD> ");
      out.print( rs.getString(4) );
      out.write("</TD>\r\n");
      out.write("                <TD> ");
      out.print( rs.getString(5) );
      out.write("</TD>\r\n");
      out.write("                <TD> ");
      out.print( rs.getString(6) );
      out.write("</TD>\r\n");
      out.write("                <TD> ");
      out.print( rs.getString(7) );
      out.write("</TD>\r\n");
      out.write("                <TD> ");
      out.print( rs.getString(8) );
      out.write("</TD>\r\n");
      out.write("                <TD> ");
      out.print( rs.getString(9) );
      out.write("</TD>\r\n");
      out.write("                 <TD> ");
      out.print( rs.getString(10) );
      out.write("</TD>\r\n");
      out.write("                <Td><button class=\"button btn btn-primary btn-large\" id=\"del\">Release</button></Td>               \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </TR>\r\n");
      out.write("     \r\n");
      out.write("  ");
    
      
	
	   dd=dd+"<option value='"+rs.getLong(1)+"'>"+rs.getString(2)+"</option>";  
       
       System.out.println("dd");
   }




      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");

   //STEP 6: Clean-up environment
   rs1.close();
   rs.close();
   stmt.close();
   stmt1.close();
   conn.close();
}catch(SQLException se){
   //Handle errors for JDBC
   se.printStackTrace();
}catch(Exception e){
   //Handle errors for Class.forName
   e.printStackTrace();
}finally{
   //finally block used to close resources
   try{
      if(stmt!=null)
         stmt.close();
   }catch(SQLException se2){
   }// nothing we can do
   try{
      if(conn!=null)
         conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }//end finally try
}//end try
System.out.println("Goodbye!");
//PrintWriter out=response.getWriter();
//out.print(dd);


//end main



















      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div> <!-- /login-fields -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"login-actions\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div> <!-- .actions -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div> <!-- /content -->\r\n");
      out.write("\t\r\n");
      out.write("</div> <!-- /account-container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Text Under Box -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/signin.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}