<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/publish.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/login.css" rel="stylesheet" type="text/css" />   
<title>${menuInfo.title}</title>
</head>
<body>
  	<div id="mainBody">
		<div id="cloud1" class="cloud"></div>
		<div id="cloud2" class="cloud"></div>
	</div>
	<div class="top">
		<span>欢迎登录后台管理界面平台</span>
		<ul>
			<li><a href="#">回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>
	<div class="main">
		<span class="systemlogo"></span>
 		<div class="loginbox">
			<ul>
				<li><input name="" type="text" class="loginuser" onclick="JavaScript:this.value=''" /></li>
				<li><input name="" type="password" class="loginpwd" onclick="" /></li>
				<li><a class="loginbtn" onclick="" href="javascript:void(0)">登陆</a>
					<label>
						<input name="" type="checkbox" value="" checked="checked" />记住密码
					</label>
					<label>
						<a href="#">忘记密码？</a>
					</label>
				</li>
			</ul>
		</div>
	</div>
	<div class="footer">
		版权所有2015，仅供学习交流，请勿用于任何商业用途
	</div>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/cloud.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/layer/layer.js"></script>
<script type="text/javascript">
	var contextPath = "<%=request.getContextPath()%>";
	var menuId = "${menuInfo.id}";
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/hrmanage/login.js"></script>
</html>