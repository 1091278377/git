package com.hwua.controller;

import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.hwua.util.AlipayConfig;



@Controller
public class PayController {
	@RequestMapping(value = "/zhifubao.do", produces="text/html;charset=utf-8", method = RequestMethod.GET)
	@ResponseBody
	public String alipayTradePagePay(String id1,String price,String name1, HttpServletRequest request, HttpServletRequest response) 
			throws Exception {
		//��ó�ʼ����AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
		
		//�����������
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
		
		//�̻������ţ��̻���վ����ϵͳ��Ψһ�����ţ�����
		Date date = new Date();
        String id2=  String.valueOf(new Timestamp(date.getTime()))+id1;
		String out_trade_no = id2;
		//���������
		String total_amount = price;
		//�������ƣ�����
		String subject = name1;
		//��Ʒ�������ɿ�
		String body = "û��";
		
		alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
				+ "\"total_amount\":\""+ total_amount +"\"," 
				+ "\"subject\":\""+ subject +"\"," 
				+ "\"body\":\""+ body +"\"," 
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		
		//�����BizContent����������ѡ����������������Զ��峬ʱʱ�����timeout_express������˵��
		//alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
		//		+ "\"total_amount\":\""+ total_amount +"\"," 
		//		+ "\"subject\":\""+ subject +"\"," 
		//		+ "\"body\":\""+ body +"\"," 
		//		+ "\"timeout_express\":\"10m\"," 
		//		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		//��������ɲ��ġ�������վ֧����API�ĵ�-alipay.trade.page.pay-����������½�
		
		//����
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		System.out.println(id1+price+name1);
		//���
		return result;


}
}