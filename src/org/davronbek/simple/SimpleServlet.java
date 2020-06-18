package org.davronbek.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("uname", request.getParameter("uname"));
		request.setAttribute("sname", request.getParameter("sname"));
		
		if(request.getParameter("question1").matches("")){
			request.setAttribute("errorMessage1", "Please do the stared questions!!");
			request.getRequestDispatcher("/testing.jsp").forward(request, response);
			
		}else if(request.getParameter("question2").matches("")){
			request.setAttribute("errorMessage2", "Please do the stared questions!!");
			request.getRequestDispatcher("/testing.jsp").forward(request, response);
		}else if(request.getParameter("question1").matches("") && request.getParameter("question2").matches("") ){
			request.setAttribute("errorMessage3", "Please do the stared questions!!");
			request.getRequestDispatcher("/testing.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("/result.jsp").forward(request, response);
			
		}
	}

}
