<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ModelMap中的数据</h1>

   ${requestScope.message}<br/>
   <c:if test="${not empty requestScope.book}">
   	 <p>列表</p>
	 ${requestScope.book.id }-${requestScope.book.name }-${requestScope.book.author }<br/>
   </c:if>
   <c:if test="${empty requestScope.book}">
   	<p>数据为空</p>
   </c:if>
  
	
</body>
</html>