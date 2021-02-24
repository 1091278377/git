$(function(){
     
	 var id=window.localStorage.getItem('queryid1');
      shop1(id);
  
     }); 

function shop1(id) {   
	 $.ajax({
		 url:"http://localhost:8080/SSMDemo2/queryOne1.do",
		 data:{id},
			 //JSON.stringify(datas),
		 dataType:"json",
		 type:"post",
		 //contentType:"application/x-www-form-urlencoded",
     	 dataType:"json",
     	 success:function(data){
     		console.log(data);
//     		alert("请求成功"+data[0].s_name);
     		 var table ="";
     		var datas = data.data;
     		if(data.flag==true){
     			table=datas[0].s_name;
//     			alert(table);
     			tupian1="images/"+datas[0].s_tupian;
     			price1=datas[0].s_price;
     			shuoming1=datas[0].s_shuoming;
     			$("#shopname1").text(table);
     		    $("#price1").text(price1);
     			$("#tupian1").attr('src',tupian1)
     			$("#shuoming1").html(shuoming1);
     			$("#tupian2").attr('src',tupian1);
//     			$("#tupian1").attr('rel',tupian1);
     			$("#tupian2").attr('big',tupian1);
     			$("#tupian2").attr('mid',tupian1);
     		
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
 function shop2(){
	 var tupian2=$("#tupian1").attr('src');
	 var username=window.localStorage.getItem('home_name1');


	 
	 var tupian = tupian2.substr(7,tupian2.length);
	 price=$("#price1").text();
     shuoming=$("#shuoming1").text();
     price=$("#price1").text();
     name=$("#shopname1").text();
     inventory=document.getElementById("text_box").value;
     
//     alert(tupian,price,shuoming,name,inventory);
     console.log(tupian);
     console.log(price);
     console.log(shuoming);
     console.log(name);
     console.log(inventory);
	 $.ajax({
		 url:"http://localhost:8080/SSMDemo2/shop2.do",
		 data:{shuoming,price,tupian,name,inventory,username},
			 
		 dataType:"json",
		 type:"post",
    	 dataType:"json",
     	 success:function(data){
     		console.log(data);
     		 var table ="";
     		if(data.flag==true ){
     			alert("添加成功");
     		
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