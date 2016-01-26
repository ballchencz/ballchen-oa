<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/normal.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/left.css" rel="stylesheet" type="text/css" />
<title>左侧</title>
</head>
<body style="background:#f0f9fd;">
	<!-- <div class="lefttop"><span></span>通讯录</div> -->
    <dl class="leftmenu">
	    <dd>
		    <div class="title">
		    	<span><img src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/leftico01.png" /></span>人事信息管理
		    </div>
		    	<ul class="menuson">
			        <li class="active"><cite></cite><a href="javascript:void(0)" url="/hrManage/toBaseInfoPage">基本信息</a><i></i></li>
			        <li><cite></cite><a href="javascript:void(0)" target="rightFrame">教育信息</a><i></i></li>
			        <li><cite></cite><a href="javascript:void(0)" target="rightFrame">工作经历</a><i></i></li>
			        <li><cite></cite><a href="javascript:void(0)" target="rightFrame">奖惩记录</a><i></i></li>
		        </ul>    
	    </dd>    
	    <dd>
	    	<div class="title">
	    		<span><img src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/leftico03.png" /></span>人事调动
	    	</div>
		    <ul class="menuson">
		        <li><cite></cite><a href="javascript:void(0)">入职管理</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)">转正管理</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)">解聘管理</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)">退休管理</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)">职位调动</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)">部门调动</a><i></i></li>
		    </ul>    
	    </dd>  
	    <dd>
		    <div class="title">
		    <span><img src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/leftico02.png" /></span>信息统计
		    </div>
		    <ul class="menuson">
		        <li><cite></cite><a href="javascript:void(0)">基本信息统计</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)" target="rightFrame">学历信息统计</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)" target="rightFrame">工作经历统计</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)" target="rightFrame">奖惩信息统计</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)" target="rightFrame">人事调动统计</a><i></i></li>
		        </ul>     
	    </dd> 
	    <dd>
	    	<div class="title">
	    		<span><img src="<%=request.getContextPath()%>/resources/css/com/ballchen/oa/hrmanage/images/leftico04.png" /></span>日期管理
	    	</div>
		    <ul class="menuson">
		        <li><cite></cite><a href="javascript:void(0)">自定义</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)">常用资料</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)">信息列表</a><i></i></li>
		        <li><cite></cite><a href="javascript:void(0)">其他</a><i></i></li>
		    </ul>
	    </dd>   
    </dl>
</body>
<script type="text/javascript">
	var contextPath = '<%=request.getContextPath()%>';
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/hrmanage/left.js"></script>
</html>