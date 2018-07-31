package com.github.ljmatlight.demo;

import com.github.ljmatlight.demo.alipay.AlipayChannel;
import com.github.ljmatlight.demo.alipay.AlipayPayRequest;
import com.github.ljmatlight.demo.wechat.WechatPayChannel;
import com.github.ljmatlight.demo.wechat.WechatPayRequest;

/**
 * 测试程序
 *
 * @author tengpeng.gao
 * @since 2018/7/31
 */
public class TestMain {


    public static void main(String[] args) {

        System.out.println(" ===== Wechatpay ======== ");

        WechatPayRequest wechatPayRequest = new WechatPayRequest();
        wechatPayRequest.setWechatId("星月道人");
        PayChannel payChannel = new WechatPayChannel();

        payChannel.pay(wechatPayRequest);


        System.out.println("\n ===== Alipay ======== ");
        /* ====================== */

        AlipayPayRequest alipayPayRequest = new AlipayPayRequest();
        alipayPayRequest.setAlipayId("星月道人");
        payChannel = new AlipayChannel();
        payChannel.pay(alipayPayRequest);

    }


}
