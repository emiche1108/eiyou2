package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ReturnColorSelect")
public class Resipemada extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 現在は準備中ページへ遷移
        request.getRequestDispatcher("/WEB-INF/jsp/recipezyunnbi.jsp").forward(request, response);
    }
}

