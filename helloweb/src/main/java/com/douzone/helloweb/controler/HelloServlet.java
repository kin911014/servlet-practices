package com.douzone.helloweb.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Hello") // 앞으로는 소문자로 할것
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() Called");
		
		String name = request.getParameter("n");
		
		response.setContentType("text/html; charset=utf-8");
		// header는 아래 로직 위에다 작성해야한다.
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>" + name +"님 안녕하세요</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
