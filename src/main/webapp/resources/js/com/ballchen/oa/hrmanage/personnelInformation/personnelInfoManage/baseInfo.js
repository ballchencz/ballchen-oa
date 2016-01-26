$(function(){
	$(".select3").uedSelect({
		width : 152
	});
})
var baseInfo = (function(){
	var returnObject = {};
	returnObject.add = function(){
		parent.layer.open({
		    type: 2,
		    title: '添加',
		    shadeClose: true,
		    shade: 0.8,
		    area: ['800px', '90%'],
		    content: [parent.contextPath+'/hrManage/toAddAndEditPage'] //iframe的url
		});
	}
	returnObject.edit = function(){
		parent.layer.open({
		    type: 2,
		    title: '修改',
		    shadeClose: true,
		    scrollbar:false,
		    shade: 0.8,
		    area: ['800px', '90%'],
		    content: parent.contextPath+'/hrManage/toAddAndEditPage' //iframe的url
		});
	}
	returnObject.remove = function(){

	}
	return returnObject;
})();