package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Color;
import model.Comment;


public class ColorDAO {
    // データベース接続のためのメソッド
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "root";
        String password = "password";
        return DriverManager.getConnection(url, username, password);
    }

    // 色のリストを取得するメソッド
    public List<Color> getColorList() {
        List<Color> colorList = new ArrayList<>();
        String sql = "SELECT * FROM colors"; // 'colors' は仮のテーブル名
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Color color = new Color();
                color.setId(resultSet.getInt("id"));
                color.setColorName(resultSet.getString("color_name"));
                colorList.add(color);
            }
        } catch (SQLException e) {
            // ここでエラーメッセージをログに記録する
            System.err.println("Error occurred while fetching color list: " + e.getMessage());
            e.printStackTrace(); 
        }
        return colorList;
    }

	public static List<Comment> getCommentsByVegetable(String vegetable) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}



