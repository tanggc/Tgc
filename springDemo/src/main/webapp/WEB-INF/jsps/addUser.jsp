<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../static/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#showUser").click(function(){
		$.ajax({
			type:"POST",
			url:"query/showUser",
			success:function(data){
				$.each(data,function(i,item){
					$("#userDiv").append("<p>"+item.userName+"-"+item.passWord+"-"+item.age+"</p>");
				});
			}
			
		});
	});
	
});
</script>    
</head>
<body>
<h2>添加用户</h2>
<form action="addResult" method="post">
	<span>name</span><input type="text" name="userName"/><br>
 	<span>password</span><input type="text" name="passWord"/><br>
 	<span>age</span><input type="text" name="age"/><br>
 	<input type="submit" value="add" name="add" />
</form>

<input type="button" value="show" id="showUser" />
<div id="userDiv"></div>	
</body>
</html>