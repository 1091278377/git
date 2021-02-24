$(function(){
   
	 var name=window.localStorage.getItem('queryid2');
//      shop1(name);

	 aaa();
	
	 bbb(name);
	 bbb1();
    });
function aaa(){
	$.ajax({
		 url:"http://localhost:8080/SSMDemo2/Site1.do",
		 data:{},
			 //JSON.stringify(datas),
		 dataType:"json",
		 type:"post",
		 //contentType:"application/x-www-form-urlencoded",
    	 dataType:"json",
    	 success:function(data){
    		console.log(data);
//    		alert("请求成功"+data[0].username)
    		 var table ="";
    		if(data !=null ){
    			for(var i=0;i<data.length;i++){	    	 
		    		table +='<div class="per-border"></div>'+
						'<li class="user-addresslist" onclick="a1(id)" id="'+data[i].t_id+'">'+
					'<div class="address-left">'+
						'<div class="user DefaultAddr">'+
							'<span class="buy-address-detail">'+   
       '<span class="buy-user" id="t_name'+data[i].t_id+'">'+data[i].t_name+'</span>'+
							'<span class="buy-phone" id="t_phone'+data[i].t_id+'">&nbsp;&nbsp;电话：'+data[i].t_phone+'</span>'+
							'</span>'+
						'</div>'+
						'<div class="default-address DefaultAddr">'+
							'<span class="buy-line-title buy-line-title-type">收货地址：</span>'+
							'<span class="buy--address-detail">'+
//					   '<span class="province">湖北</span>省'+
//							'<span class="city">武汉</span>市'+
//							'<span class="dist">洪山</span>区'+
							'<span class="street" id="t_dizhi'+data[i].t_id+'">'+data[i].t_dizhi+'</span>'+
							'</span>'+
							'</span>'+
						'</div>'+
						'<ins class="deftip">默认地址</ins>'+
					'</div>'+
					'<div class="address-right">'+
						'<a href="../person/address.html">'+
							'<span class="am-icon-angle-right am-icon-lg"></span></a>'+
					'</div>'+
					'<div class="clear"></div>'+

					'<div class="new-addr-btn">'+
						'<a href="#" class="hidden">设为默认</a>'+
						'<span class="new-addr-bar hidden">|</span>'+
						'<a href="#">编辑</a>'+
						'<span class="new-addr-bar">|</span>'+
						'<a href="javascript:void(0);" onclick="del('+data[i].t_id+');">删除</a>'+
					'</div>'+
				'</li>';
    		}
    		$("#site1").html(table);
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
function a1(id){
	var ccc="user-addresslist defaultAddr";
	$("#"+id).attr('class',ccc);
	var bbb="a2(id)";
	$("#"+id).attr('onclick',bbb);
	var t_name=$("#t_name"+id).text();

	$("#t_nameaa").text(t_name);
	$("#t_nameaa").attr('name',id);
	var t_dizhi=$("#t_dizhi"+id).text();

	$("#t_dizhiaa").text(t_dizhi);
	var t_phone=$("#t_phone"+id).text();

	$("#t_phoneaa").text(t_phone);
}
function a2(id){
	var ccc="user-addresslist";
	$("#"+id).attr('class',ccc);
	var bbb="a1(id)";
	$("#"+id).attr('onclick',bbb);
}
function bbb(name){
	var id=name;
	$.ajax({
		 url:"http://localhost:8080/SSMDemo2/CarqueryOne1.do",
		 data:{id},
			 //JSON.stringify(datas),
		 dataType:"json",
		 type:"post",
		 //contentType:"application/x-www-form-urlencoded",
   	 dataType:"json",
   	 success:function(data){
   		console.log(data);
//   		alert("请求成功"+data[0].username)
   		 var table ="";
   		price4=data[0].inventory*data[0].price*1;
   		price4=price4.toFixed(2);
   		if(data !=null ){
   			for(var i=0;i<data.length;i++){	
   				  price2=data[i].inventory*data[i].price*1;
		    	  price3=price2.toFixed(2);
		    		table +='<ul class="item-content clearfix">'+
						'<div class="pay-phone">'+
					'<li class="td td-item">'+
						'<div class="item-pic">'+
							'<a href="#" class="J_MakePoint">'+
								'<img src="images/'+data[i].tupian+'" class="itempic J_ItemImg" style="width:100%;height:100%;" id="dizhi_tupian"></a>'+
						'</div>'+
						'<div class="item-info">'+
							'<div class="item-basic-info">'+
								'<a href="#" name="'+data[i].id+'" class="item-title J_MakePoint" data-point="tbcart.8.11" id="dizhi_name">'+data[i].name+'</a>'+
							'</div>'+
						'</div>'+
					'</li>'+
					'<li class="td td-info">'+
						'<div class="item-props">'+
							'<span class="sku-line" id="dizhi_shuoming">'+data[i].shuoming+'</span>'+
							
						'</div>'+
					'</li>'+
					'<li class="td td-price">'+
						'<div class="item-price price-promo-promo">'+
							'<div class="price-content">'+
								'<em class="J_Price price-now" id="dizhi_price">'+data[i].price+'</em>'+
							'</div>'+
						'</div>'+
					'</li>'+
				'</div>'+
				'<li class="td td-amount">'+
					'<div class="amount-wrapper ">'+
						'<div class="item-amount ">'+
							'<span class="phone-title">购买数量</span>'+
							'<div class="sl">'+
								'<input class="min am-btn" name="" type="button" value="-" />'+
								'<input class="text_box" name="" id="dizhi_inventory1" type="text" value="'+data[i].inventory+'" style="width:30px;" />'+
								'<input class="add am-btn" name="" type="button" value="+" />'+
							'</div>'+
						'</div>'+
					'</div>'+
				'</li>'+
				'<li class="td td-sum">'+
					'<div class="td-inner">'+
						'<em tabindex="0" class="J_ItemSum number" id="price12">'+price3+'</em>'+
					'</div>'+
				'</li>'+
				'<li class="td td-oplist">'+
					'<div class="td-inner">'+
						'<span class="phone-title">配送方式</span>'+
						'<div class="pay-logis">'+
							'快递<b class="sys_item_freprice">10</b>元'+
						'</div>'+
					'</div>'+
				'</li>';
   		}
   		$("#cccc").html(table);
   		$("#price02").text(price4);
   		$("#J_ActualFee").text(price4);
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
function bbb1(){
//	var price02 = $("#price12").text();
//	alert(price02);
//	$("#price02").text(price02);
}
function tiaozhuan(){
	
	//添加订单删除购物车商品
	var id1=$("#dizhi_name").attr('name');
	var name1 =$("#dizhi_name").text();
	var price1 =$("#dizhi_price").text();
	var price2 =$("#price12").text();
	var inventory1 = $("#dizhi_inventory1").attr('value');
	var tupian1 =$("#dizhi_tupian").attr('src');
	var tupian2 =tupian1.substr(7,tupian1.length);
	var dizhiid1 =$("#t_nameaa").attr('name');
	var shuoming1 =$("#dizhi_shuoming").text();
	var username1=window.localStorage.getItem('home_name1');
	$.ajax({
		 url:"http://localhost:8080/SSMDemo2/Site3.do",
		 data:{id1,price1,name1,inventory1,tupian2,dizhiid1,inventory1,shuoming1,username1},
			 //JSON.stringify(datas),
		 dataType:"json",
		 type:"post",
   	 dataType:"json",
   	 success:function(data){
   		console.log(data);
		     		 
   		if(data==true ){
   			location.href="http://localhost:8080/SSMDemo2/zhifubao.do?id1="+id1+"&name1="+name1+"&price="+price2
				 	
   	}
  		else{
	    		alert("请先登录 不然没数据")
	    		}
   	 },
   	 error:function(request){
		    	alert("服务器加载中")
		    } 
	 })
//	 location.href="zhifu_tupian.html";
	var price =$("#J_ActualFee").text();
	
	window.localStorage.setItem('queryprice01',price);
	var name = $("#t_nameaa").text();
	window.localStorage.setItem('queryprice02',name);
	var phone = $("#t_phoneaa").text();
	window.localStorage.setItem('queryprice03',phone);
	var dizhi = $("#t_dizhiaa").text();
	window.localStorage.setItem('queryprice04',dizhi);
	
//	$.ajax({
//		 url:"http://localhost:8080/SSMDemo2/zhifubao.do",
//		 data:{id1,name1,price},
//			 //JSON.stringify(datas),
//		 dataType:"json",
//		 type:"post",
//		 //contentType:"application/x-www-form-urlencoded",
//  	 dataType:"json",
//  	 success:function(data){
//  		console.log(data);
//		     		 
//  		if(data==true ){
//  			location.href="http://localhost:8080/SSMDemo2/zhifubao.do"
//  		
//  	}
//  		else{
//	    		alert("请先登录 不然没数据")
//	    		}
//  	 },
//  	 error:function(request){
//		    	alert("服务器加载中")
//		    } 
//	 })
}


function add(){
	var name=$("#user-name").val();
	var phone=$("#user-phone").val();
	var dizhi=$("#user-intro").val();
//	console.log(name);
//	console.log(phone);
//	console.log(dizhi);
	$.ajax({
		 url:"http://localhost:8080/SSMDemo2/Site2.do",
		 data:{name,phone,dizhi},
			 //JSON.stringify(datas),
		 dataType:"json",
		 type:"post",
		 //contentType:"application/x-www-form-urlencoded",
    	 dataType:"json",
    	 success:function(data){
    		console.log(data);
 		    
    		 
    		if(data =true ){
    		
    			alert("添加成功");
    			 location.href="pay.html";
    		
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
//删除
function del(id){
	
	$.ajax({
		 url:"http://localhost:8080/SSMDemo2/Site5.do",
		 data:{id},
			 //JSON.stringify(datas),
		 dataType:"json",
		 type:"post",
		 //contentType:"application/x-www-form-urlencoded",
  	 dataType:"json",
  	 success:function(data){
  		console.log(data);
		    
  		 
  		if(data =true ){
  		
			alert("删除成功");
			location.href="pay.html";
  		
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
	

	
