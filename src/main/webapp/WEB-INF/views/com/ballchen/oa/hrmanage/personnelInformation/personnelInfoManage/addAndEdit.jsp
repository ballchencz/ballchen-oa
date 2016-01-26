<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加/修改</title>
<link href="<%=request.getContextPath()%>/resources/css/style.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/css/select.css"
	rel="stylesheet" type="text/css" />
</head>
<body style="overflow-x:hidden">
	<div class="formbody">

		<div class="formtitle">
			<span>基本信息</span>
		</div>

		<ul class="forminfo">
			<li><label>姓名<b>*</b></label><input name="" type="text"
				class="dfinput" /><i>标题不能超过30个字符</i></li>
			<li><label>性别</label><div class="vocation">
					<select class="select1">
						<option>女</option>
						<option>男</option>
					</select>
				</div></li>
			<li><label>民族</label><div class="vocation">
					<select class="select1">
						<c:forEach items="${nationJSONStr}" var="item">
							<option value='<c:out value="${item.key}"/>'><c:out value="${item.value}"/></option>
						</c:forEach>
					</select>
				</div></li>
			<li><label>婚姻状况</label><div class="vocation">
					<select class="select1">
						<option value="0">未婚</option>
						<option value="1">已婚</option>
						<option value="2">离异</option>
						<option value="3">丧偶</option>
					</select>
				</div></li>
			<li><label>政治面貌</label><div class="vocation">
					<select class="select1">
						<option value="0">群众</option>
						<option value="1">团员</option>
						<option value="2">党员</option>
						<option value="3">其他</option>
					</select>
				</div></li>
			<li><label>出生日期<b>*</b></label><input name="" type="text" class="dfinput" onclick="WdatePicker()"/></li>
			<li><label>身份证号码<b>*</b></label><input name="" type="text" class="dfinput"/></li>
			<li><label>个人电话</label><input name="" type="text" class="dfinput"/></li>
			<li><label>电子邮箱</label><input name="" type="text" class="dfinput"/></li>
			<li><label>籍贯</label>
			<textarea name="" cols="" rows="" class="textinputsmall"></textarea></li>
			<li><label>备注</label>
			<textarea name="" cols="" rows="" class="textinput"></textarea></li>
			<li><label>&nbsp;</label><input name="" type="button"
				class="btn" value="确认保存" /></li>
		</ul>


	</div>
</body>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/select-ui.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/hrmanage/personnelInformation/personnelInfoManage/addAndEdit.js"></script>
</html>