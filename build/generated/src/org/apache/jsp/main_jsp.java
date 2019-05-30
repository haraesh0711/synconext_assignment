package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("    JSP web application to list service providers\n");
      out.write("    Developed in Netbeans IDE using HTML/CSS, Bootstrap 4, JSP\n");
      out.write("    Presented as assignment for Synconext's Java Developer application\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Popular Service Providers</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assignment_style.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Search bar -->\n");
      out.write("            <div class=\"row panel\">\n");
      out.write("                <div class=\"col-sm-3\">Home</div>\n");
      out.write("                <div class=\"col-sm-9\"><input type = \"text\" id = \"search-box\" class = \"form-control search-box\"></div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Sort bar -->\n");
      out.write("            <div class =\"row panel\">\n");
      out.write("                <div class=\"col-sm-3\">Sort by</div>\n");
      out.write("                <div class=\"col-sm-9 row\">\n");
      out.write("                    <div class =\"col\"><input type = \"radio\" id = \"sort_by_name\" name = \"sort_by\" value = \"name\" onclick = \"handleOptions()\">Name</div>\n");
      out.write("                    <div class =\"col\"><input type = \"radio\" id = \"sort_by_price\" name = \"sort_by\" value = \"price\" onclick = \"handleOptions()\">Price</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Display service providers here -->\n");
      out.write("            ");

                try {
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/synconext_db", "root", "highgarden");
                   Statement st = conn.createStatement();
                   ResultSet rs = st.executeQuery("SELECT * FROM PROVIDERS");
                
      out.write("\n");
      out.write("            <div id = \"provider_populate\" class=\"provider-populate\">\n");
      out.write("                <div class= \"row panel table-panel\">\n");
      out.write("                    <div class =\"col\">Name</div>\n");
      out.write("                    <div class =\"col\">Lowest Price</div>\n");
      out.write("                    <div class =\"col\">Rating</div>\n");
      out.write("                    <div class =\"col\">Max Speed</div>\n");
      out.write("                    <div class =\"col\">Contact Number</div>\n");
      out.write("                    <div class =\"col\">Email</div>\n");
      out.write("                    <div class =\"col\">Contact</div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    while (rs.next()) {
                
      out.write("\n");
      out.write("                       <div class = \"row panel table-panel provider-panel\">\n");
      out.write("                           <div class =\"col\">");
      out.print( rs.getString("name") );
      out.write("</div>\n");
      out.write("                           <div class =\"col\">");
      out.print( rs.getDouble("lowest_price") );
      out.write("+</div>\n");
      out.write("                           <div class =\"col\">");
      out.print( rs.getInt("rating") );
      out.write("</div>\n");
      out.write("                           <div class =\"col\">");
      out.print( rs.getString("max_speed") );
      out.write("</div>\n");
      out.write("                           <div class =\"col\">");
      out.print( rs.getString("contact_no") );
      out.write("</div>\n");
      out.write("                           <div class =\"col\">");
      out.print( rs.getString("email") );
      out.write("</div>\n");
      out.write("                           <div class =\"col\"><a href = \"");
      out.print( rs.getString("url") );
      out.write(" \" target = \"_blank\">Click here</a></div>\n");
      out.write("                       </div>\n");
      out.write("                       ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("        <script>\n");
      out.write("            function handleOptions() {\n");
      out.write("                if(document.getElementById('sort_by_name').checked) {\n");
      out.write("                    ");

                        rs = st.executeQuery("SELECT * FROM PROVIDERS ORDER BY NAME ASC");
                        
                    
      out.write("\n");
      out.write("                }\n");
      out.write("                if(document.getElementById('sort_by_price').checked) {\n");
      out.write("                    ");

                        rs = st.executeQuery("SELECT * FROM PROVIDERS ORDER BY LOWEST_PRICE ASC");
                        
                    
      out.write("\n");
      out.write("                }\n");
      out.write("                ");

                    String result = "";
                    while(rs.next()) {
                        result += "<div class = 'row panel table-panel provider-panel'><div class ='col'>"+rs.getString("name")+"</div><div class ='col'>"+rs.getDouble("lowest_price")+"</div><div class ='col'>"+rs.getInt("rating")+"</div><div class ='col'>"+rs.getString("max_speed")+"</div><div class ='col'>"+rs.getString("contact_no")+"</div><div class ='col'>"+rs.getString("email")+"</div><div class ='col'><a href = '"+rs.getString("url")+"' target = '_blank'>Click here</a></div></div>";
                    }
                
      out.write("\n");
      out.write("                document.getElementById(\"provider-populate\").innerHTML = ");
      out.print( result );
      out.write(";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");

                }
                catch(Exception e) {
                    out.println(e);
                }
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
