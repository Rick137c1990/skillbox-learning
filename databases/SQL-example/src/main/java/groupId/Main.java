package groupId;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/skillboxx";
        String user = "root";
        String password = "1234567";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT MONTH(subscription_date) AS month, COUNT(*) AS total_courses," +
                "COUNT(*) / COUNT(DISTINCT MONTH(subscription_date)) AS average_courses \n" +
                "FROM purchaselist \n" +
                "WHERE YEAR(subscription_date) = 2018 \n" +
                "GROUP BY MONTH(subscription_date);");
        while (resultSet.next()) {
            String month = resultSet.getString("month");
            String totalCourses = resultSet.getString("total_courses");
            String averageCourses = resultSet.getString("average_courses");
            System.out.println(month + " | " + totalCourses + " | " + averageCourses);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
