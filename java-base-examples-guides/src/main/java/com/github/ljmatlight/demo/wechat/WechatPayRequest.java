package com.github.ljmatlight.demo.wechat;

import com.github.ljmatlight.demo.PayRequest;

/**
 * 微信支付请求参数定义
 *
 * @author tengpeng.gao
 * @since 2018/7/31
 */
public class WechatPayRequest implements PayRequest {

    private String wechatId;

    @Override
    public String toString() {
        return "WechatPayRequest{" + "wechatId='" + wechatId + '\'' + '}';
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }
}
