function aaa(){
	var id=window.localStorage.getItem('dingdan_dizhiid1');
	$.ajax({
		 url:"http://localhost:8080/SSMDemo2/Site4.do",
		 data:{id},
			 //JSON.stringify(datas),
		 dataType:"json",
		 type:"post",
		 //contentType:"application/x-www-form-urlencoded",
    	 dataType:"json",
    	 success:function(data){
    		console.log(data);
//    		alert("请求成功"+data[0].s_name);
    		 var table ="";
    		
    		if(data!=null){
    			table +='<div class="icon-add">'+
									'</div>'+
									'<p class="new-tit new-p-re">'+
										'<span class="new-txt">'+data[0].t_name+'</span>'+
										'<span class="new-txt-rd2">&nbsp;&nbsp'+data[0].t_phone+'</span>'+
									'</p>'+
									'<div class="new-mu_l2a new-p-re">'+
										'<p class="new-mu_l2cw">'+
											'<span class="title">收货地址：</span>'+
//											'<span class="province">湖北</span>省'+
//											'<span class="city">武汉</span>市'+
//											'<span class="dist">洪山</span>区'+
											'<span class="street">'+data[0].t_dizhi+'</span></p>'+
									'</div>';
    			$("#dingdan_dizhi").html(table);
    		
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