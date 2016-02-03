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
		$('form').form('submit',{
			onSubmit:function(){
				return $(this).form('enableValidation').form('validate');
			}
		});
	});
	/*获得表单所有input元素*/
	var formChildInputElements = $('form > ul > li > input[type="text"]');
	/*获得表单多有textarea元素*/
	var formChildTextareaElements = $('form > ul > li > textarea');
	/*为input元素绑定easyui验证*/
	$.each(formChildInputElements,function(index,value){
		var text = $(value).attr('name');
		switch (text) {
		case 'userName':
			$(value).validatebox({required:true,validType:['length[0,30]'],missingMessage:'姓名不能为空',invalidMessage:'姓名最多30个字符'});
			break;
		case 'birthday':
			$(value).validatebox({required:true,missingMessage:'出生日期不能为空',validType:['shortDate']});
			break;
		case 'idNum':
			$(value).validatebox({required:true,missingMessage:'身份证号码不能为空',validType:['length[0,30]','idCard']});
			break;		
		case 'phone':
			$(value).validatebox({validType:['mobile']});
			break;
		case 'email':
			$(value).validatebox({validType:['email'],invalidMessage:'email格式不合法'});
			break;
		}
	});
	/*为textarea元素绑定easyui验证*/
	$.each(formChildTextareaElements,function(index,value){
		var text = $(value).attr('name');
		switch(text){
			case 'nativePlace':
				$(value).validatebox({validType:['length[0,200]'],invalidMessage:'籍贯最多200个字符'});
				break;
			case 'mark':
				$(value).validatebox({validType:['length[0,500]'],invalidMessage:'备注最多500个字符'});
				break;
		}
	});
	/*表单初始化*/
	$('form').form({
		novalidate:true,
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
	
})