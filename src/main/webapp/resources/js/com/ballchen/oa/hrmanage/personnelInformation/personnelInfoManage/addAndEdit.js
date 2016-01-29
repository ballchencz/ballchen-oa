var addAndEdit = (function(){
	var returnObject = {};
	returnObject.init = function(){
		$(".select1").uedSelect({});
	}
	return returnObject
})();
addAndEdit.init();
$(function(){
	$('.btn').bind('click',function(){
		$('form').form({
			url:parent.contextPath+"/hrManage/amUserBasic",
			success:function(data){
				data = $.parseJSON(data);
				if(data.flag){
					parent.$('#mainCenterIframe').get(0).contentWindow.location.reload(true);
					var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
					parent.layer.close(index);
				}else{
					parent.layer.alert(data.info);
				}
			}
		});
		$('form').submit();
	});
})