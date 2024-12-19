package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Color;
import model.Comment;
import service.CommentService; 



@WebServlet("/colorSelect")
public class ColorSelect extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 文字エンコーディングの設定(文字化けを解消するために必要)
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        
        // 選ばれた色を取得
        String selectedColor = request.getParameter("color");

        // 色に関連する野菜を取得
        List<String> vegetables = getVegetablesByColor(selectedColor);

        // vegetablesが空の場合はエラーメッセージを表示
        if (vegetables.isEmpty()) {
            request.setAttribute("errorMessage", "選択された色には関連する野菜がありません。");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
            dispatcher.forward(request, response);
            return;  
        }

        
        // ランダムに野菜を選ぶ
        Random random = new Random();
        
        // vegetablesが1つ以上ある場合にランダムに選ぶ
        if (vegetables.size() > 0) {
            String selectedVegetable = vegetables.get(random.nextInt(vegetables.size()));
        
            // 野菜に関連するコメントを取得
            List<Comment> comments = getCommentsByVegetable(selectedVegetable);

            // リクエスト属性に設定
            request.setAttribute("selectedColor", selectedColor);
            request.setAttribute("selectedVegetable", selectedVegetable);
            request.setAttribute("comments", comments);

            // JSPに遷移
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
            dispatcher.forward(request, response);
        } else {
            // vegetablesが空だった場合の処理
            request.setAttribute("errorMessage", "選ばれた色には関連する野菜がありません。");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
            dispatcher.forward(request, response);
        }
    }
    

    // 色に関連する野菜を取得
    private List<String> getVegetablesByColor(String selectedColor) {
        Color colorInfo = Color.getColorInfo(selectedColor);
        return (colorInfo != null) ? colorInfo.getVegetables() : new ArrayList<>();  // null チェック
    }

    // 野菜に関連するコメントを取得
    private List<Comment> getCommentsByVegetable(String selectedVegetable) {
        return CommentService.getCommentsForVegetable(selectedVegetable);
    }
}
