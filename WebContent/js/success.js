function success11(){
	var price=window.localStorage.getItem('queryprice01');
	var name=window.localStorage.getItem('queryprice02');
	var phone=window.localStorage.getItem('queryprice03');
	var dizhi=window.localStorage.getItem('queryprice04');
	console.log(name);
	var phone2 = phone.substr(5,phone.length);
	var aaa='<li>付款金额<em >'+price+'</em></li>'+
       '<div class="user-info">'+
         '<p >收货人：'+name+'</p>'+
         '<p >联系电话：'+phone2+'</p>'+
         '<p >收货地址：'+dizhi+'</p>'+
       '</div>'+
             '请认真核对您的收货信息，如有错误请联系客服';
    $("#dingdang").html(aaa);                           
}