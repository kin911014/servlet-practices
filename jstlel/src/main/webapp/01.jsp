<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	pageContext.setAttribute("newLine", "\n");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p style='width: 200px; height: 120px; border: 1px solid #0000ff'>
		${fn:replace(sval, newLine, "<br>") }
	</p>

	<h1>데이터타입</h1>
	${ival }
	<br> ${lval }
	<br> ${fval }
	<br> ${bval }
	<br> -${obj }-
	<br> ${vo.no }
	<br> ${vo.name }
	<br>

	<h1>산술연산 해보기</h1>
	${3+10*20 }
	<br> ${ival+10 }
	<br>

	<h1>관계연산 해보기</h1>
	${ival == 10 }
	<br> ${ival < 5 }
	<br> ${obj == null }
	<br> ${vo == null }
	<br> ${vo != null }
	<br>
	<!-- null은 사용하지 말것 대신 empty를 이용할 것 -->
	${empty obj}
	<br> ${not empty obj}
	<br>


	<h1>논리연산 해보기</h1>
	${ival == 10 && lval<10000 }
	<br> ${ival < 5 || val-10 ==0  }
	<br>


	<h1>파라미터 값 받아보기</h1>
	-${param.a }-
	<br> -${param.email }-
	<br>


	<h1>map으로 값 받아보기</h1>
	${map.ival }
	<br> ${map.lval }
	<br> ${map.fval }
	<br> ${map.bval }
	<br>


</body>
</html>