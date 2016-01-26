<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<tr>
					<td><input type="checkbox" /></td>
					<td class="imgtd"><img
						src="<%=request.getContextPath()%>/resources/images/img11.png" /></td>
					<td><a href="#">非常不错的国外后台模板，支持HTML5</a>
					<p>发布时间：2013-10-12 09:25:18</p></td>
					<td>后台界面
						<p>ID: 82122</p>
					</td>
					<td>开放浏览</td>
					<td>admin</td>
					<td>已审核</td>
					<td>128</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td class="imgtd"><img
						src="<%=request.getContextPath()%>/resources/images/img11.png" /></td>
					<td><a href="#">非常不错的国外后台模板，支持HTML5</a>
					<p>发布时间：2013-10-12 09:25:18</p></td>
					<td>后台界面
						<p>ID: 82122</p>
					</td>
					<td>开放浏览</td>
					<td>admin</td>
					<td>已审核</td>
					<td>128</td>
				</tr>
			</tbody>
		</table>
		<div class="pagin">
			<div class="message">
				共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页
			</div>
			<ul class="paginList">
				<li class="paginItem"><a href="javascript:;"><span
						class="pagepre"></span></a></li>
				<li class="paginItem"><a href="javascript:;">1</a></li>
				<li class="paginItem current"><a href="javascript:;">2</a></li>
				<li class="paginItem"><a href="javascript:;">3</a></li>
				<li class="paginItem"><a href="javascript:;">4</a></li>
				<li class="paginItem"><a href="javascript:;">5</a></li>
				<li class="paginItem more"><a href="javascript:;">...</a></li>
				<li class="paginItem"><a href="javascript:;">10</a></li>
				<li class="paginItem"><a href="javascript:;"><span
						class="pagenxt"></span></a></li>
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
	src="<%=request.getContextPath()%>/resources/js/com/ballchen/oa/hrmanage/personnelInformation/personnelInfoManage/baseInfo.js"></script>
</html>