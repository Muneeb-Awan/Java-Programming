<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Drinks List</title>
</head>
<body>
    <form action="processOrder.jsp" method="post">
        <label for="drink">Select a Drink:</label>
        <select name="drink" id="drink">
            <option value="">-- Select a Drink --</option>
            <% 
                // Import required Java classes
                Class.forName("com.mysql.cj.jdbc.Driver"); // Load the JDBC driver

                Connection conn = DriverManager.getConnection("jdbc:mysql://your-database-url:3306/Database", "your-username", "your-password");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM beverages");

                while (rs.next()) {
                    String name = rs.getString("name");
                    int rate = rs.getInt("rate");
            %>
            <option value="<%= name %>"><%= name %> ($<%= rate %>)</option>
            <%
                }
                rs.close();
                stmt.close();
                conn.close();
            %>
        </select>
        <br>
        <input type="submit" value="Submit Order">
    </form>
</body>
</html>
