package com.github.ljmatlight.demo.wechat;

import com.github.ljmatlight.demo.PayChannel;
import com.github.ljmatlight.demo.PayRequest;

/**
 * 微信支付渠道
 *
 * @author tengpeng.gao
 * @since 2018/7/31
 */
public class WechatPayChannel implements PayChannel {
    @Override
    public void pay(PayRequest payRequest) {

        boolean flag = payRequest instanceof WechatPayRequest;
        if(flag){
            System.out.println("payRequest instanceof WechatPayRequest ==== " + flag);
            WechatPayRequest wechatPayRequest = (WechatPayRequest)payRequest;
            System.out.println("WechatPayRequest.wechatId ==== " + wechatPayRequest.getWechatId());
        }

        System.out.println("payRequest ==== " + payRequest);
    }
}
