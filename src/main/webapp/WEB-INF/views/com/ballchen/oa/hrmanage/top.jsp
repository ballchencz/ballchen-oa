<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人力资源管理头部</title>
<link href="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/normal.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/top.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="topleft">
		<a href="main.html" target="_parent"><img src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/images/logo.png"
			title="系统首页" /></a>
	</div>

 	<ul class="nav">
		<li><a href="javascript:void(0)" target="rightFrame" class="selected"><img
				src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/personnel_information.png" title="人事信息" />
			<h2>人事信息</h2></a></li>
		<li><a href="javascript:void(0)" target="rightFrame"><img
				src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/recruitment_ management.png" title="招聘管理" />
			<h2>招聘管理</h2></a></li>
		<li><a href="javascript:void(0)" target="rightFrame"><img
				src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/contract_of_ labour.png" title="劳动合同" />
			<h2>劳动合同</h2></a></li>
		<li><a href="javascript:void(0)" target="rightFrame"><img
				src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/education_and_training.png" title="培训管理" />
			<h2>培训管理</h2></a></li>
		<li><a href="javascript:void(0)" target="rightFrame"><img
				src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/attendance_management.png" title="考勤管理" />
			<h2>考勤管理</h2></a></li>
		<li><a href="javascript:void(0)" target="rightFrame"><img
				src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/performance_management.png" title="绩效管理" />
			<h2>绩效管理</h2></a></li>
		<li><a href="javascript:void(0)" target="rightFrame"><img
				src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/welfare_management.png" title="福利管理" />
			<h2>福利管理</h2></a></li>
		<li><a href="javascript:void(0)" target="rightFrame"><img
				src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/salary_management.png" title="工资管理" />
			<h2>工资管理</h2></a></li>
	</ul>

	<div class="topright">
		<ul>
			<li><span><img src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/help.png" title="帮助"
					class="helpimg" /></span><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
			<li><a href="login.html" target="_parent">退出</a></li>
		</ul>

		<div class="user">
			<span>admin</span> <i>消息</i> <b>5</b>
		</div>

	</div>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/hrmanage/top.js"></script>
</html>