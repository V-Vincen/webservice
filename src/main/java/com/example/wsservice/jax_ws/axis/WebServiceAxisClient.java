package com.example.wsservice.jax_ws.axis;


import com.example.wsservice.jax_ws.axis.wsdl.WebServiceI;
import com.example.wsservice.jax_ws.axis.wsdl.WebServiceIServiceLocator;

import java.net.URL;

/**
 * @author vincent
 * WebService 服务端，axis 开发
 */
public class WebServiceAxisClient {
    public static void main(String[] args) throws Exception {
        WebServiceIServiceLocator serviceLocator = new WebServiceIServiceLocator();
        String address = "http://127.0.0.1:8989/webservice/cxf";
        WebServiceI webServiceI = serviceLocator.getWebServiceIPort(new URL(address));
        String result = webServiceI.sayHello("Vincent");
        System.out.println(result);
        System.out.println();

        result = webServiceI.webserviceSave("Vincent", "18");
        System.out.println(result);
    }
}
