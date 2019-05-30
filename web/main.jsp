<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
    JSP web application to list service providers
    Developed in Netbeans IDE using HTML/CSS, Bootstrap 4, JSP
    Presented as assignment for Synconext's Java Developer application
-->
<html>
    <head>
        <title>Popular Service Providers</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <link rel="stylesheet" href="assignment_style.css">
        <%@ page import = "java.sql.*" %>
    </head>
    <body>
    <center>
        <div class="container">
            <!-- Search bar -->
            <div class="row panel">
                <div class="col-sm-3"><i class="fas fa-2x fa-home"></i><br>Home</div>
                <div class="col-sm-9"><input type = "text" id = "search-box" class = "form-control search-box"></div>
            </div>
            <!-- Sort bar -->
            <div class ="row panel">
                <div class="col-sm-3"><i class="fas fa-2x fa-sort"></i><br>Sort by</div>
                <div class="col-sm-9 row">
                    <div class ="col"><input type = "radio" id = "sort_by_name" name = "sort_by" value ="name" onclick = "handleOptions('name')">&nbsp;&nbsp;&nbsp;Name</div>
                    <div class ="col"><input type = "radio" id = "sort_by_price" name = "sort_by" value ="price"onclick = "handleOptions('price')">&nbsp;&nbsp;&nbsp;Price</div>
                </div>
            </div>
            <!-- Display service providers here -->
            <%
                try {
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/synconext_db", "root", "highgarden");
                   Statement st = conn.createStatement();
                   ResultSet rs = st.executeQuery("SELECT * FROM PROVIDERS");
                %>
            <div id = "provider_populate" class="provider-populate">
                <div class= "row panel table-panel">
                    <div class ="col">Name</div>
                    <div class ="col">Prices From</div>
                    <div class ="col">Rating</div>
                    <div class ="col">Maximum Speed</div>
                    <div class ="col">Contact</div>
                    <div class ="col">Email</div>
                    <div class ="col">Website</div>
                </div>
                <%
                    while (rs.next()) {
                %>
                       <div class = "row panel table-panel provider-panel">
                           <div class ="col"><img src = "<%= rs.getString("image") %>" width = "150px" height = "50px" style = "padding-bottom: 10px"><br><%= rs.getString("name") %></div>
                           <div class ="col">Rs. <%= rs.getDouble("lowest_price") %>+</div>
                           <div class ="col"><%= rs.getInt("rating") %>/5</div>
                           <div class ="col"><%= rs.getString("max_speed") %></div>
                           <div class ="col"><%= rs.getString("contact_no") %></div>
                           <div class ="col"><%= rs.getString("email") %></div>
                           <div class ="col"><a href = "<%= rs.getString("url") %> " target = "_blank">Click here</a></div>
                       </div>
                       <%
                    }
                %>
            </div>
        </div>
    </center>
    <%
        }
        catch(Exception e) {
            out.println(e);
        }
    %>
    </body>
</html>

