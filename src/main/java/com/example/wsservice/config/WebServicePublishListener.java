package com.example.wsservice.config;

import com.example.wsservice.cxf.service.WebServiceI;
import com.example.wsservice.cxf.service.WebServiceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author vincent
 * 使用 Servlet3.0 提供的 @WebListener 注解将实现了 ServletContextListener 接口的 WebServicePublishListener
 * 类标注为一个 Listener
 */
@WebListener
public class WebServicePublishListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置发布的地址
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:8080/webservice/cxf");
        //设置服务的接口
        jaxWsServerFactoryBean.setServiceClass(WebServiceI.class);
        //设置服务的实现对象
        jaxWsServerFactoryBean.setServiceBean(new WebServiceImpl());
        //通过工厂创建服务
        jaxWsServerFactoryBean.create();
        System.out.println("发布 webservice 成功！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
