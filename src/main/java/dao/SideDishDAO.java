package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SideDishDAO {
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "root";
        String password = "password";
        return DriverManager.getConnection(url, username, password);
    }

    public List<String> getSideDishesForColor(String color) {
        List<String> sideDishes = new ArrayList<>();
        String sql = "SELECT side_dish FROM side_dishes WHERE color = ?"; // 仮のテーブルとカラム名
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, color);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                sideDishes.add(resultSet.getString("side_dish"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sideDishes;
    }
}
