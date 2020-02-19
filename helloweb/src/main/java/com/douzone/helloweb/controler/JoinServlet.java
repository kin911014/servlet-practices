package com.douzone.helloweb.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post방식으로 넘엉오는 데이터 엔코딩,바디부분 엔코딩 로직으로 항상 맨위에!
		// get방식은 URIEncoding="UTF-8"을 servers의 server.xml에 설정.
		request.setCharacterEncoding("utf-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String birthyear = request.getParameter("birthyear");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		String desc = request.getParameter("self-intro");
		
		System.out.println(email);
		System.out.println(password);
		System.out.println(birthyear);
		System.out.println(gender);
		for(String hobby: hobbies) {
			System.out.println(hobby);
		}
		System.out.println(desc);
		
		response.setContentType("text/html; charset =utf-8"); 
		response.getWriter().println("ok");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
