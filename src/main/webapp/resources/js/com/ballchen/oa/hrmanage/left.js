$(function(){	
	//导航切换
	$(".menuson .header").click(function(){
		var $parent = $(this).parent();
		$(".menuson>li.active").not($parent).removeClass("active open").find('.sub-menus').hide();
		
		$parent.addClass("active");
		if(!!$(this).next('.sub-menus').size()){
			if($parent.hasClass("open")){
				$parent.removeClass("open").find('.sub-menus').hide();
			}else{
				$parent.addClass("open").find('.sub-menus').show();	
			}
			
			
		}
	});
	
	// 三级菜单点击
	$('.sub-menus li').click(function(e) {
        $(".sub-menus li.active").removeClass("active")
		$(this).addClass("active");
    });
	//二级菜单点击
	$('.menuson > li > a').click(function(e){
		var a = $('.menuson > li > a').parents('li').removeClass('active');//a标签数组；
		//遍历a标签，显示控制显
		var text = $(this).text();
		var mainJqueryObject = parent.$;
		var mainCenter = parent.$('#mainBody').layout('panel','center');
		mainCenter.panel('setTitle',text);
		mainJqueryObject('#mainCenterIframe').attr('src',contextPath+'/hrManage/toMainCenterPage');
		$(this).parents('li').addClass('active');
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('.menuson').slideUp();
		if($ul.is(':visible')){
			$(this).next('.menuson').slideUp();
		}else{
			$(this).next('.menuson').slideDown();
		}
	});
})