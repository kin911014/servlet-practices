package jstlel;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/01")
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ival = 10;
		long lval = 10;
		float fval =1.4f;
		boolean bval = true;
		Object obj = null;
		UserVo vo = new UserVo();
		vo.setNo(01L);
		vo.setName("김철수");
		String sval = "가\n나\n다\n라";
		
		// map을 사용해서 여러 값을 한번에 넘기는 방법
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ival", ival);
		map.put("lval", lval);
		map.put("fval", fval);
		map.put("bval", bval);
		map.put("obj", obj);
		map.put("vo", vo);
		
		request.setAttribute("ival", ival);
		request.setAttribute("lval", lval);
		request.setAttribute("fval", fval);
		request.setAttribute("bval", bval);
		
		request.setAttribute("sval", sval);
		
		request.setAttribute("obj", obj);
		request.setAttribute("vo", vo);
		
		request.setAttribute("map", map);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/01.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
