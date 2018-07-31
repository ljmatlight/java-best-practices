package com.github.ljmatlight.demo;

/**
 * 支付渠道接口
 *
 * @author tengpeng.gao
 * @since 2018/7/31
 */
public interface PayChannel {

    void pay(PayRequest payRequest);

}
