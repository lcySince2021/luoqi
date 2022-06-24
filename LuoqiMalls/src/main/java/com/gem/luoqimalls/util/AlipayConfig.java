package com.gem.luoqimalls.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id ="2016092000551807";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQC3wsfzH7krQrodB7p5g2TObfhJlIJn7tVcl/Xys+mmxgu+cSwYTb/6UrpzrJ/yc7Z59b5spx11aKhxeXFkfombWmRrLW71TGdgkOEjxUlkcgexvyj8rc4VpOliQ4S1LwhFXeT6FDWdrajc5bLQMEtGINOywlx5T2wNG7ISflpKraosCG8uhjIhB9C9CuMPQnP3HFH/aCqq9DfaJIljD0FFIMZSN3wiOFe4SMKfFq8L+Rux5rLrkbihCcqjxCwdoVRrNJaqZiDpyaEkRdv/yC3tGTIokQMDt1i+5n+Z0DRhsaoh93vI4t7tdWFyJA0Va2Zh4xsjLROD9xK4XDZHqVczAgMBAAECggEAawAnT6FMQC11k8vZQEJLI4yTQ70PBhfi8yylEPLD/dFaK0VY6Ln1LHyZhxugcxv/yBpZDIlutNwBIToW1e58kBJdYK8u6fTYSTlzb1HEf5GKe2yVIDTQSHgjUY2BK8M8LLAU0a2M3sitCBtUOLe2TRp2SqO0FwsxHpze3rfmOY7RpgOH8EVoNpg+Ktlez9QGcGKhYKdHvJ+JvLQJaymCv1XD9AkryCN8O1voI7Xjqj3bpTAoxqz2fEfQxJblubEusskafJrfvckANdr633jjDgxyGpt7Gfu0mGRxi7mc8hoq4EYNfGlTYVf42hgs69IMDWQ0DsJHjSFqsfNdP2kkMQKBgQD0Okc+AtCwZrG3EOfkcZvIEcF+S5zKhhkjm356jF65cY1EpyPDaSFbiyIhhSNcLBZ3LQwMJcQPTeFFZUB+aUqEHw0uLegvyx9Rgo7sdv6fqKSrI5I8lTShb4J9Cwu1xg8qlhnOtR2mtZH5ISrLjD2DMGxfezUKszpPm8qHhQMbSwKBgQDAnlq4pgqbRE4qcxWuP2Rj9ypJU2q30SO6lcd1V4nlu2HXl052M0MA04usxRa6bnnZ531Dh4fmROoO3V2DIP1Cpj/U6OQRizq3bpoT8Bk908HQaMW3G0YaAqxETI+kIUrko6eKbozL5lF6WRxcbhBkMyw4N+OZN9Nq65Vzks8auQKBgQCBUbKThU4Xeek0NEF11ypTwAMi6sq0+lipYBaSsW0e6J+S8KWhPTOqk3uZIDRfBAFJTZMJg53TNLvJ0RlbVklcuEx0XV6KoBWPRYCEeWXOCLBY5lbyuVbK/I6tw4GJ2LwDIsO7jm+K7K3EqulMKpAPvT5FOKoXZlvD94xAQhApDQKBgQCLaZHsF3GR06xnmQhWJ9e3asuWauPQy3R6tbG5wnQybJ9ydTb64jtau8JaeAPtR8y15JCLcerwxWxK+fmW0Se9N6r3pOB9ujHzVf/68kqyrzOWbl68GudwKAMbI/bLKrWUKsc2sLEDW14ZmamnVJpUi50zy2/WE8vXlU+EaPuxMQKBgQC//K7Ogdsn7/AnUOjVL9sTpw+jFy68qwa4liyL4st8y+fgHi2UCXHUST7K87gWRZgr1tNm8EaQKKmYj0j9kDr8pUG59JSrccxYsSyRnUVWdkoxygDMNOyN+vYlo4JvlcigRUgAcdys2tESVwAge8FXLFkxgO3PrgPgi7oABOERJA==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/Luoqi/user/main";

    // 签名方式
    public static String sign_type = "RSA";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关  https://openapi.alipaydev.com/gateway.do
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


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
