<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面</title>
<link href="<%=request.getContextPath()%>/resources/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body style="background-color: #1c77ac; background-image: url(<%=request.getContextPath()%>/resources/images/light1.png); background-repeat: no-repeat; background-position: center top; overflow: hidden;">


	<div class="logintop">
		<span>欢迎进入信息管理系统</span>
		<ul>
			<li><a href="#">回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>

	<div class="loginbody1">

		<span class="systemlogo"></span>

		<div class="loginbox0">

			<ul class="loginlist">
				<li><a href="login1.html"><img src="<%=request.getContextPath() %>/resources/images/l01.png"
						alt="电子监察系统" />
						<p>
							教育电子监察<br />管理系统
						</p></a></li>
				<li><a href="login2.html"><img src="<%=request.getContextPath() %>/resources/images/l02.png"
						alt="电子监察系统" />
						<p>
							高校采购与招标<br />管理系统
						</p></a></li>
				<li><a href="login3.html"><img src="<%=request.getContextPath() %>/resources/images/l03.png"
						alt="电子监察系统" />
						<p>
							高校科研经费<br />管理系统统
						</p></a></li>
				<li><a href="login4.html"><img src="<%=request.getContextPath() %>/resources/images/l04.png"
						alt="电子监察系统" />
						<p>
							教育信息化建设工程<br />项目管理系统
						</p></a></li>
			</ul>


		</div>

	</div>

	<div class="loginbm">
		版权所有 2014&nbsp;&nbsp;&nbsp; <strong>uimaker.com</strong>
		&nbsp;&nbsp;&nbsp;仅供学习交流，勿用于任何商业用途
	</div>


</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		$('.loginbox0').css({
			'position' : 'absolute',
			'left' : ($(window).width() - 810) / 2
		});
		$(window).resize(function() {
			$('.loginbox0').css({
				'position' : 'absolute',
				'left' : ($(window).width() - 810) / 2
			});
		})
	});
</script>
</html>