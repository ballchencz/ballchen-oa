/**
 * 基本页面js
 */
$(function(){
	/*为主菜单绑定点击事件*/
	$('.contentUl > li > a').bind('click',function(){
		var menuInfo = $(this).attr('data-options');
		menuInfo = menuInfo.replace(/'/g,'"');
		menuInfo = $.parseJSON(menuInfo);
		var menuId = menuInfo.id;
		window.location.href=contextPath+"/hrManage/toHrmanageMainPage";
	});
	
    $(document).ajaxSend(function(e,xhr,opt) {
    	console.info(opt);
        if (opt.type == "POST"){  
            var header = $('meta[name=_csrf_header]').attr('content');  
            var token  = $('meta[name=_csrf]').attr('content');   
            if (header != '' && token != ''){             
                xhr.setRequestHeader(header, token);  
            }  
        }  
    });  
})