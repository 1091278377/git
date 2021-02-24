$(function(){
 
	 aaa();	
    });
function aaa(){
	var username=window.localStorage.getItem('home_name1');
	 $.ajax({
		 url:"http://localhost:8080/SSMDemo2/dingdan1.do",
		 data:{username},
			 //JSON.stringify(datas),
		 dataType:"json",
		 type:"post",
		 //contentType:"application/x-www-form-urlencoded",
     	 dataType:"json",
     	 success:function(data){
     		console.log(data);
     		var datas=data.data;
//     		alert("请求成功"+datas[0].d_name)
     		 var table ="";
     		if(data.flag=true ){
     			for(var i=0;i<datas.length;i++){
     				price2=datas[i].d_price*datas[i].d_inventory*1;
     				price2=price2.toFixed(2);
		    		table +='<div class="order-title">'+
					'<div class="dd-num">订单编号：<a href="javascript:;">'+datas[i].d_id+'</a></div>'+
					'<span>成交时间：2021-01-04</span>'+
					'<!--    <em>店铺：小桔灯</em>-->'+
				'</div>'+
				'<div class="order-content" >'+
		    			'<div class="order-left" >'+
		    			'<ul class="item-list">'+
						'<li class="td td-item">'+
					'<div class="item-pic">'+
						'<a href="#" class="J_MakePoint">'+
							'<img src="../images/'+datas[i].d_tupian+'" class="itempic J_ItemImg">'+
						'</a>'+
					'</div>'+
					'<div class="item-info">'+
						'<div class="item-basic-info">'+
							'<a href="#">'+
								'<p>'+datas[i].d_name+'</p>'+
								'<p class="info-little">'+datas[i].d_shuoming+''+
									'<br/>包装：裸装 </p>'+
							'</a>'+
						'</div>'+
					'</div>'+
				'</li>'+
				'<li class="td td-price">'+
					'<div class="item-price">'+
						''+datas[i].d_price+''+
					'</div>'+
				'</li>'+
				'<li class="td td-number">'+
					'<div class="item-number">'+
						'<span>×</span>'+datas[i].d_inventory+''+
					'</div>'+
				'</li>'+
				'<li class="td td-operation">'+
					'<div class="item-operation">'+						
					'</div>'+
				'</li>'+
			'</ul>'+
			'</div>'+
			'<div class="order-right">'+
				'<li class="td td-amount">'+
					'<div class="item-amount">'+
						'合计：'+price2+''+
						'<p>含运费：<span>10.00</span></p>'+
					'</div>'+
				'</li>'+
				'<div class="move-right">'+
					'<li class="td td-status">'+
						'<div class="item-status">'+
							'<p class="Mystatus" style="color:#F00">'+datas[i].d_fahuo+'</p>'+
						'<p class="order-info"><a href="#" name="'+datas[i].d_dizhiid+'" onclick="tiaozhuan(name)" >订单详情</a></p>'+
						'<p class="order-info"><a href="logistics.html">查看物流</a></p>'+
						'</div>'+
					'</li>'+
					'<li class="td td-change">'+
						'<div class="am-btn am-btn-danger anniu">'+
							'删除订单</div>'+
					'</li>'+
				'</div>'+
			'</div>'+
		'</div>'+
	'</div>'			;
     		}
     		$("#dingdan1").html(table);
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
function tiaozhuan(name){
	window.localStorage.setItem('dingdan_dizhiid1',name);
	 location.href="orderinfo.html";
}