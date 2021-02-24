function shop00() {   
	 $.ajax({
		 url:"http://localhost:8080/SSMDemo2/shop1.do",
		 data:{},
			
		 dataType:"json",
		 type:"post",
		 
     	 dataType:"json",
     	 success:function(data){
     		console.log(data);
//     		alert("请求成功"+data[0].s_name);    		 
     		if(data !=null ){
     			var table ="";
     			for(var i=0;i<data.length;i++){
     			   table +='<li>'+
							'<div class="i-pic limit" onclick="aaa('+data[i].s_id+')">'+
								'<img  src="images/'+data[i].s_tupian+'" style="width:100%;height:100%;"/>'+											
									'<p class="title fl">【良品铺子旗舰店】'+data[i].s_name+'</p>'+
										'<p class="price fl">'+
											'<b>¥</b>'+
											'<strong>'+data[i].s_price+'</strong>'+
										'</p>'+
										'<p class="number fl">'+
												'销量<span>1110</span>'+
										'</p>'+
									'</div>'+
							'</li>';
     			}
     			$("#shop1").html(table);
     	}
     		else{
	    		alert("请先登录 不然没数据")
	    		}
     	 },
     	 error:function(request){
		    	alert("服务器加载中")
		    } 
	 })
   }
function aaa(id){
	 location.href="introduction.html";
	 window.localStorage.setItem('queryid1',id);
}