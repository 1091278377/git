package com.hwua.util;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000117600267";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCOYfTusnTdPRKh9/46JmHs826Ld4+ZpG/exYu6OCxKiWUjjRLwyPONjhW+qyYEVhJCaRCrRTtvvbxpw1WIXjZYPIIY3pop7MkI31tI7hBLKZF8xr0LpDP5QlPWvNVneh27qhQF5/QYfoL7Z9iuZnmKs6ZlPAgjO8uCPxRa0xHqEaSbpEVGzLps2CdD5dkv8Crbe05YWV/GpzD6na5jk5PD344CsKuyobxPDZyZygsThDD8tzGUb6DYiugeZ6gLI9gEd+e9F1EyTX/cxyQBgF5SsMxMqTVELslPPgpgeGeDQdgLamnrEyxRtv4PdbCFnI+viHJkk25UacsdGEI6Z9QVAgMBAAECggEACgsw6vGdusmHGfPTdCim+b8GSkJJ1+24kn9e5uj1fuCISOS3tFKIk7C1KfkKun2T1ilxKpO8qJo6wz8rNm5m6PyDtNtnBpQUblLLLq7UaWjqQWIHjd2saOXb4ib56s27cTSDKxN8rYmnFbLynwLNihI4J6X/cPTT20E1315KQjeW5aXAuwOEbCa1URn87c4ZruGenHcV+uPZVJULSkq4kJrN1kDJ1GjArnJpYx3WWdOfwLCeqUA1IKJSxSNOa4fE6HPZRdf16bgO9qRyU+/ZMGVfC8BjXz9uhTN981zasTFKqbRhvFq17bC+XAfE2Ew0XZcQi8eYtou59qF6FZ/ygQKBgQDp8ginYC1Oejavc9AWsPWvvKrtuLIaMqaxZq6Tun5k7MgbPo8QR3cIXDM0FMv9KJeK2FiUP2GKhOv9bY6fZT5Lek5uxuYfI7mfoWeP08iIlM8tZ4i0xIFVW5YNx2rwclHy06G6ytcmlV9Yfq2HS82hMLQ8d8h1yZjCt5b4mG/y4QKBgQCbzizKNsrd+98E+Zl+8xlMRh0ZruX8ws20/bxG1NQf+0lfU4THmN/iyPv5ktLkIMAmij1QiKwNTypwrGndWoU6IQSNaYanMYVimhkIR4NjNkqkpbK9w5QamKyE4m+IHoFDd4S21nMpGStmLGEdUQIBnHx9F0IAHuvOZhb7mm97tQKBgCHv1WeKYSgoPHSZRU91Xj6fDOCtUVDRljLX5W1SuXEklCa3nYNMCq1wypC8j5bq44jlt3vR8fFpNN6vnOfshOvoEyaovcs4oH3SqTZJD6cYhzFb+o3Wj7h1L8BR9GZq/w5NuwFg2XMkag9pWPzudybx7MN00OSdWQauIT1wx5ShAoGAUV4hQhHPbJLHa9+2a/glNBJBzFHsxk4uA+GnXA52IaWoMeJ6K4sJEXUJMtOc04rPDtGPJ+nYgLLhZSqFtxY5EZyAtiFwMwzHrjDv9cTzNvL5lHb8m+HyDNnC7zsaKCpWM5fNdXcVeVcttRRkO109AP5qfSGSVGHRoF7sjcWfhykCgYEAywtoPwfvQJ+eyqRdWz44J12Q/LISIfEevsxwlinxQ2HorMYfHgmThhsuFoBACp3fbuLln4f8kh2Qzg7/+btP7aMprVv2zRqP1V7LsJvIiGL/j80UNo6riDCdepnQCtDgdaBLCzoOhjlfDZLUF+UNEd1w7ifKgk7ZHbunhY4REAI=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgqWFnIhlswnJwXMxWTOk8qkPFTTTtcWzfOv5egw4rq6TxPhyMmAAQ0IOmT/sXZHmRHmJfz6ifbYXll3nhgtyK+qNnA23/msed+rHfs3Sm0gQW6t7NhHHjzimDO0HXXdVAM8LhXeLWpyOwdhBsIDTZCI6fUmeXRpNbCmsYhexuHg9SB2/Dp1T+4DxnBSon9B7M1ohLjSPJuNmOqoak5/Hq0JNkjoqnpQXbnFOJS0EpdoqF3H9crxomgXs2ORsAZdjZZf3pRSBMakRbWx24tcaDY1PFhqLdql1YkTNaGwPXvPpDUuL/+99WyuG62fMDks6NJc0yhZIavTfNGEY+QcLRQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/SSMDemo2/success.html";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/SSMDemo2/success.html";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

