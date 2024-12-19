package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dish;
import service.SideDishService; 


	@WebServlet("/SideDishServlet")
	public class SideDishServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        // 色からランダムに選択された野菜
	        String selectedVegetable = request.getParameter("selectedVegetable");
	        
	        // 野菜からレシピを取得
	        List<Dish> recipes = SideDishService.getRecipesForVegetable(selectedVegetable);
	        // リクエストスコープに格納
	        request.setAttribute("recipes", recipes);
	        // JSPにデータを渡す
	        request.setAttribute("selectedVegetable", selectedVegetable);

	        // JSPへフォワード
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
	        dispatcher.forward(request, response);
	    }
	}
    
