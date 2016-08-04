<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/publish.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/main/main.css" rel="stylesheet" type="text/css" />
<title>信息管理系统</title>
</head>
<body>
	<div class="top">
		<span>欢迎进入信息管理系统</span>
		<ul>
			<li><a href="#">回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>
	<div class="main">
		<span class="systemlogo"></span>
			<ul class="contentUl">
				<li>
					<a href="javascript:void(0)" data-options="{'id':'0'}">
						<img src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/main/images/hr_manage.png" alt="人力资源管理系统" />
						<br/><br/>
						人力资源管理系统
					</a>
				</li>
				<li>
					<a href="javascript:void(0)" data-options="{'id':'1'}">
						<img src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/main/images/personal_office.png" alt="个人办公系统" />
						<br/><br/>
						个人办公系统
					</a>
				</li>
				<li>
					<a href="javascript:void(0)" data-options="{'id':'2'}">
						<img src="<%=request.getContextPath() %>/resources/css/com/ballchen/oa/main/images/project_manage.png" alt="项目管理系统" />
						<br/><br/>
						项目管理系统
					</a>
				</li>
				<li>
					<a href="javascript:void(0)" data-options="{'id':'3'}">
						<img src="<%=request.getContextPath() %>/resources/css/com/ballchen/oa/main/images/system_setting.png" alt="系统管理" />
						<br/><br/>
						系统管理
					</a>
				</li>
			</ul>
		</div>
	<div class="footer">		
		版权所有2015，仅供学习交流，请勿用于任何商业用途
	</div>
</body>
<script type="text/javascript">
	var contextPath = "<%=request.getContextPath()%>";
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/main/basic.js"></script>
</html>