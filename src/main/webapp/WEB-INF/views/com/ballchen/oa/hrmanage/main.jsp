<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人力资源管理</title>
<link href="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/themes/default/easyui.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/themes/icon.css" rel="stylesheet" type="text/css" />
</head>
<body class="easyui-layout" id="mainBody">
	<div data-options="region:'north',border:false" style="height:88px;">
		<iframe scrolling="no" frameborder="0" width="100%" height="100%" src="<%=request.getContextPath()%>/hrManage/toHrmanageMainPageTop"></iframe>
	</div>
	<div data-options="region:'west',split:false,title:'人事信息'" style="width:187px;">
		<iframe scrolling="no" frameborder="0" width="100%" height="100%" src="<%=request.getContextPath()%>/hrManage/toHrmanageMainPageLeft"></iframe>
	</div>
	<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>
	<div data-options="region:'south',border:false" style="height:31px;background:#A9FACD;padding:10px;">south region</div>
	<div data-options="region:'center',title:'基本信息',cache:false,tools:[{
					iconCls:'icon-reload',
					handler:function(){
						$('#mainCenterIframe').attr('src', $('#mainCenterIframe').attr('src'));
					}
				}]">
		<iframe id="mainCenterIframe" src="<%=request.getContextPath()%>/hrManage/toBaseInfoPage" scrolling="auto" frameborder="0" width="100%" height="100%"></iframe>
	</div>
</body>
<script type="text/javascript">
	var contextPath = "<%=request.getContextPath()%>";
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/jquery-easyui-1.4.4/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/layer/layer.js"></script>
</html>