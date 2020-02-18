package jstlel;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/02")
public class _02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * 1. 객체가 오래 지속 되는 순서
		 *   Appication(Context) Scope > Session Scope > Request Scope > Page Scope 
		 *   
		 * 2. EL이 같은 이름에 값을 찾는 순서
		 *   Page Scope > Request Scope > Session Scope > Appication(Context) Scope
		 * 
		 */
		
		// request scope
		UserVo vo1 = new UserVo();
		vo1.setNo(01L);
		vo1.setName("김철수");
		
		request.setAttribute("vo", vo1);
		
		// session scope
		UserVo vo2 = new UserVo();
		vo2.setNo(02L);
		vo2.setName("이철수");
		
		request.getSession(true).setAttribute("vo", vo2);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/02.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
