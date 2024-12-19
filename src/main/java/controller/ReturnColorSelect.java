package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ReturnColorSelect")
public class ReturnColorSelect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	
        // recipezyunnbi.jspへ飛ぶ
        request.getRequestDispatcher("/WEB-INF/jsp/recipezyunnbi.jsp").forward(request, response);
    }
}