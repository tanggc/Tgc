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
<h2>用户信息</h2>

   <c:if test="${not empty user}">
   	 <p>新增数据</p>
	 ${user.userName }-${user.passWord }-${user.age }<br/>
   </c:if>
   <c:if test="${empty user}">
   	<p>添加失败</p>
   </c:if>
  
	
</body>
</html>