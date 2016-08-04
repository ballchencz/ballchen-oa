<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/basicPageTag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<h1>登录页面</h1>
	<form name='f' action="<%=request.getContextPath()%>/login" method="post">  
          <table>  
             <tr>  
                <td>User:</td>  
                <td><input type='text' name='username' value=''></td>  
             </tr>  
             <tr>  
                <td>Password:</td>  
                <td><input type='password' name='password' /></td>  
             </tr>  
             <tr>  
                <td><input name="submit" type="submit" value="submit" /></td>  
             </tr>  
          </table>
          <security:csrfInput/>  
      </form>
</body>
</html>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/main/basic.js"></script>
