package com.example.wsservice.config;

import com.example.wsservice.cxf.service.WebServiceI;
import com.example.wsservice.cxf.service.WebServiceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author vincent
 * 用于发布 WebService 的 Servlet
 * 使用 Servlet3.0 提供的 @WebServlet 注解将继承 HttpServlet 类的普通 Java 类标注为一个 Servlet
 * 1.将 value 属性设置为空字符串，这样 WebServicePublishServlet 就不提供对外访问的路径
 * 2.loadOnStartup 属性设置 WebServicePublishServlet 的初始化时机
 */
@WebServlet(value = "", loadOnStartup = 0)
public class WebServicePublishServlet extends HttpServlet {

    /**
     * (non-Javadoc)
     *
     * @see javax.servlet.GenericServlet#init()
     * 在 WebServicePublishServlet 初始化时发布 WebService
     */
    @Override
    public void init() throws ServletException {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置发布的地址
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:8888/webservice/cxf");
        //设置服务的接口
        jaxWsServerFactoryBean.setServiceClass(WebServiceI.class);
        //设置服务的实现对象
        jaxWsServerFactoryBean.setServiceBean(new WebServiceImpl());
        //通过工厂创建服务
        jaxWsServerFactoryBean.create();
        System.out.println("发布 webservice 成功！");
    }
}
