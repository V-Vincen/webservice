package com.example.wsservice.jax_ws.cxf.service;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @author vincent
 * WebService 服务端
 */
public class WebServicePublish {
    public static void main(String[] args) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置发布的地址
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:8989/webservice/cxf");
        //设置服务的接口
        jaxWsServerFactoryBean.setServiceClass(WebServiceI.class);
        //设置服务的实现对象
        jaxWsServerFactoryBean.setServiceBean(new WebServiceImpl());
        //通过工厂创建服务
        jaxWsServerFactoryBean.create();
        System.out.println("发布 webservice 成功！");
    }
}
