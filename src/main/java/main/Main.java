package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Main")
public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    	
    	//細かい挨拶内容は、GreetingUtilファイルに頼んだ。
        String greetingMessage = GreetingUtil.generateGreetingMessage();
        request.setAttribute("greeting", greetingMessage);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
        dispatcher.forward(request, response);
    }
}