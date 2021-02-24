
$(function(){
    
	 var name=window.localStorage.getItem('home_name1');
     var aaa="";
       aaa+='<div class="menu-hd">'+
							'<a href="#" target="_top" class="h">热烈欢迎'+name+'</a>'+
							'<a href="login.html" target="_top">&nbsp;&nbsp退出</a>'+
						'</div>';
    $("#home_user1").html(aaa);
   });
function aaa(id){
	location.href="introduction.html";
	 window.localStorage.setItem('queryid1',id);
}