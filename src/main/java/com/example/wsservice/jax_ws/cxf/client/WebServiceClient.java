package com.example.wsservice.jax_ws.cxf.client;


import com.example.wsservice.jax_ws.cxf.client.wsdl.WebServiceI;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @author vincent
 * WebService 服务端，cxf 开发
 */
public class WebServiceClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        //设置服务的地址
        jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:8989/webservice/cxf");
        //设置服务的接口
        jaxWsProxyFactoryBean.setServiceClass(WebServiceI.class);
        //通过工厂获取服务
        WebServiceI webServiceI = (WebServiceI) jaxWsProxyFactoryBean.create();
        //调用发布的服务方法
        String result = webServiceI.sayHello("Vincent");
        System.out.println(result);
        System.out.println();

        //调用发布的服务方法
        result = webServiceI.webserviceSave("Vincent", "24");
        System.out.println(result);
    }
}
