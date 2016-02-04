<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/tablib/page.tld" prefix="page"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基本信息</title>
<link href="<%=request.getContextPath()%>/resources/css/style.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/css/select.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="rightinfo">
		<div class="tools">

			<ul class="toolbar">
				<li class="click" onclick="baseInfo.add()"><span><img
						src="<%=request.getContextPath()%>/resources/images/t01.png" /></span>添加</li>
				<li class="click" onclick="baseInfo.edit()"><span><img
						src="<%=request.getContextPath()%>/resources/images/t02.png" /></span>修改</li>
				<li onclick="baseInfo.remove()"><span><img
						src="<%=request.getContextPath()%>/resources/images/t03.png" /></span>删除</li>
			</ul>
		</div>
		<ul class="seachform1">
			<li><label>姓名</label><input name="" type="text"
				class="scinput1" /></li>
			<li><label>性别</label>
				<div class="vocation">
					<select class="select3">
						<option></option>
						<option>男</option>
						<option>女</option>
					</select>
				</div></li>

			<li><label>出生日期</label>
				<input id="beginDate" name="" type="text" class="scinput1" onclick="WdatePicker({maxDate:'#F{$dp.$D(\'endDate\')}'})" />
				&nbsp;至&nbsp;
				<input id="endDate" name="" type="text" class="scinput1" onclick="WdatePicker({minDate:'#F{$dp.$D(\'beginDate\')}'})"/>
			</li>
			<li><input name="" type="button" class="scbtn" value="查询"></li> 
		</ul>


		<table class="imgtable">
			<thead>
				<tr>
					<th><input type="checkbox" /></th>
					<th width="100px;">头像</th>
					<th>姓名</th>
					<th>性别</th>
					<th>出生日期</th>
					<th>民族</th>
					<th>个人电话</th>
					<th>电子邮箱</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userBasics}" var="userBasic">
					<tr>
						<td><input type="checkbox" value="${userBasic.id}"/></td>
						<td class="imgtd"><img src="<%=request.getContextPath()%>/resources/images/img11.png" /></td>
						<td><a href="#">${userBasic.userName}</a></td>
						<td>
							<c:choose>
								<c:when test="${userBasic.userSex==0}">
									女
								</c:when>
								<c:when test="${userBasic.userSex==1}">
									男
								</c:when>
							</c:choose>
						</td>
						<td>${userBasic.birthday}</td>
						<td><c:out value="${nations[userBasic.nation]}"></c:out></td>
						<td>${userBasic.phone}</td>
						<td>${userBasic.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<page:page page="${pageHelper.page}" rows="${pageHelper.rows}" total="${pageHelper.total}"/>
	</div>
</body>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/select-ui.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/base/base.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/hrmanage/personnelInformation/personnelInfoManage/baseInfo.js"></script>
</html>