package com.github.ljmatlight.demo.alipay;

import com.github.ljmatlight.demo.PayChannel;
import com.github.ljmatlight.demo.PayRequest;

/**
 * 支付宝支付渠道
 *
 * @author tengpeng.gao
 * @since 2018/7/31
 */
public class AlipayChannel implements PayChannel {
    @Override
    public void pay(PayRequest payRequest) {

        boolean flag = payRequest instanceof AlipayPayRequest;
        if(flag){
            System.out.println("payRequest instanceof alipayPayRequest ==== " + flag);
            AlipayPayRequest alipayPayRequest = (AlipayPayRequest)payRequest;
            System.out.println("AlipayPayRequest.alipayId ==== " + alipayPayRequest.getAlipayId());
        }

        System.out.println("payRequest ==== " + payRequest);
    }
}
