package com.github.ljmatlight.demo.alipay;

import com.github.ljmatlight.demo.PayRequest;

/**
 * 支付宝支付请求参数定义
 *
 * @author tengpeng.gao
 * @since 2018/7/31
 */
public class AlipayPayRequest implements PayRequest {

    private String alipayId;

    public String getAlipayId() {
        return alipayId;
    }

    @Override
    public String toString() {
        return "AlipayPayRequest{" + "alipayId='" + alipayId + '\'' + '}';
    }

    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId;
    }
}
