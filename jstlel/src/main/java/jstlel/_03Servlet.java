package jstlel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/03")
public class _03Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<UserVo> list = new ArrayList<UserVo>();
		
		UserVo vo1 = new UserVo();
		vo1.setNo(01L);
		vo1.setName("김철수");
		
		UserVo vo2 = new UserVo();
		vo2.setNo(02L);
		vo2.setName("이철수");
		
		UserVo vo3 = new UserVo();
		vo3.setNo(03L);
		vo3.setName("박철수");
		
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		
		request.setAttribute("list", list);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/03.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
