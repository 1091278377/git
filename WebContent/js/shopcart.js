 //开始就加载
function shopcart1(){
	var username=window.localStorage.getItem('home_name1');
	  $.ajax({
		  url:"http://localhost:8080/SSMDemo2/shop.do",
		  data:{username},
		  dataType:"json",
		  type:"post",
		  success:function(data){
			  console.log(data);
	     	  /*alert("请求成功"+data[0].tupian)*/	
	     		if(data !=null ){		
//			    	var aaa="";
//			    	var price="";
//			    	var price2="";
//			    	var inventory="";
//			    	var price3="";
//			    	var shuoming="";
	     			var table ="";
	     			var price2="";
			    for(var i=0;i<data.length;i++){
			    	
			  
//			    	aaa =data[0].name;
//		    		table ="images/"+data[0].tupian;
//		    		price=data[0].price;
//		    		price2=price*2;
//		    		inventory=data[0].inventory;
//		    		price3=price*inventory;
			    	price2=data[i].inventory*data[i].price*1;
			    	price3=price2.toFixed(2);
		    		table +='<ul class="item-content clearfix">'+
					'<li class="td td-chk">'+
					'<div class="cart-checkbox ">'+
						'<input class="check" id="'+data[i].id+'" name="items[]" value="170037950254" type="checkbox" onclick="aaa(id)">'+
						'<label for="J_CheckBox_170037950254"></label>'+
					'</div>'+
				'</li>'+
				'<li class="td td-item">'+
					'<div class="item-pic">'+
						'<a href="#" target="_blank" data-title="美康粉黛醉美东方唇膏口红正品 持久保湿滋润防水不掉色护唇彩妆" class="J_MakePoint" data-point="tbcart.8.12">'+
							'<img src="images/'+data[i].tupian+'" class="itempic J_ItemImg" id="tupian01" style="width:auto;height:100%;"></a>'+
					'</div>'+
					'<div class="item-info">'+
						'<div class="item-basic-info">'+
							'<a href="introduction.html" target="_blank" title="美康粉黛醉美唇膏 持久保湿滋润防水不掉色" class="item-title J_MakePoint" data-point="tbcart.8.11" id="name1">'+data[i].name+'</a>'+
						'</div>'+
					'</div>'+
				'</li>'+
				'<li class="td td-info">'+
					'<div class="item-props item-props-can">'+
						'<span class="sku-line"id="shuoming">'+data[i].shuoming+'</span>'+
						'<!-- <span class="sku-line">包装：裸装</span> -->'+
						'<span tabindex="0" class="btn-edit-sku theme-login">修改</span>'+
						'<i class="theme-login am-icon-sort-desc"></i>'+
					'</div>'+
				'</li>'+
				'<li class="td td-price">'+
					'<div class="item-price price-promo-promo">'+
						'<div class="price-content">'+
							'<div class="price-line">'+
								'<em class="price-original"id="price2">78.00</em>'+
							'</div>'+
							'<div class="price-line">'+
								'<em class="J_Price price-now" tabindex="0" id="price">'+data[i].price+'</em>'+
							'</div>'+
						'</div>'+
					'</div>'+
				'</li>'+
				'<li class="td td-amount">'+
					'<div class="amount-wrapper ">'+
						'<div class="item-amount ">'+
							'<div class="sl">'+
								'<input class="min am-btn" name="" type="button" value="-" />'+
								'<input class="text_box" id="inventory" type="text" value="'+data[i].inventory+'" style="width:30px;" />'+
								'<input class="add am-btn" name="" type="button" value="+" />'+
							'</div>'+
						'</div>'+
					'</div>'+
				'</li>'+
				'<li class="td td-sum">'+
					'<div class="td-inner">'+
						'<em tabindex="0" class="J_ItemSum number" id="priceaa'+data[i].id+'">'+price3+'</em>'+
					'</div>'+
				'</li>'+
				'<li class="td td-op">'+
					'<div class="td-inner">'+
						'<a title="移入收藏夹" class="btn-fav" href="#">移入收藏夹</a>'+
						'<a href="javascript:;" data-point-url="#" class="delete"onclick="deletaone1('+data[i].id+')">删除</a>'+
					'</div>'+
				'</li>'+
			'</ul>'; 
//		    		 $("#tupian01").attr('src',table); 
//		    		 $("#name1").html(aaa);
//		    		 $("#price1").html(price);
//		    		 $("#price2").html(price2);
//		    		 $("#inventory").attr('value',inventory); 		 
//	     		     $("#price3").html(price3);
//	     		     $("#shuoming").text(shuoming);
		    		
			    }
			    	$("#shopcart1").html(table);
			    	}	
	     		else{
		    		alert("请先登录 不然没数据")
		    		}
		  },
		  error:function(request){
		 		    	alert("先登录才有购物车")
		 		  } 
	  })
   }
//结算
function aaa(id){
	var price= $("#priceaa"+id).text()*1;
	
	var price4=$("#J_Total").text()*1;
	console.log(price4);
	var price5=price4+price;
	var price6=price5.toFixed(2);
	$("#J_Total").text(price6);
	 var aaa2="aaa2(id)";
	 var ccc=id;
     $("#J_Go").attr('name',ccc);
//	 $("#J_Total").attr('onclick',);
	 $("#"+id).attr('onclick',aaa2);
}
//结算2
function aaa2(id){
	var price= $("#priceaa"+id).text()*1;
	
	var price4=$("#J_Total").text()*1;
	var price5=price4-price;
	var price6=price5.toFixed(2);
	$("#J_Total").text(price6);
	 var aaa="aaa(id)";
	 var ccc=0;
     $("#J_Go").attr('name',ccc);
	 $("#"+id).attr('onclick',aaa);
}
function deletaone1(id){
	 $.ajax({
		  url:"http://localhost:8080/SSMDemo2/deleshopcart.do",
		  data:{id},
		  dataType:"json",
		  type:"post",
		  
		  success:function(data){
			  console.log(data);
			  if(data==true){
				   alert("删除成功"+id);
				   location.href="shopcart.html";
			  }else{
				  alert("删除失败"+id);
			  }
		  },
		  error:function(request){
		    	alert("删除失败"+id);
		    	
		    } 
	  })
}
function ccc(name){
	 
	 window.localStorage.setItem('queryid2',name);
	 if(name==0){
		 alert("没选择商品");
		 }else{
	 location.href="pay.html";}
	 
}