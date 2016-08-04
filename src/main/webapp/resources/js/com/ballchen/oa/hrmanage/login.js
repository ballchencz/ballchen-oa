var com_ballchen_oa_hrmanage_login = (function(){
	var returnValue = {};
	$(".loginbtn").bind('click',function(){
		var url = contextPath+"/main/toMainPage?menuId="+menuId;
		$.post(url,{name:'chenzhao',password:'123151254234'},function(data){
			if(data.flag){
				//window.location.href=contextPath+"/hrManage/toHrmanageMainPage";
			}else{
				layer.alert(data.info, {icon: 2});
			}
		},"json");
	});
	return returnValue;
})();
