package com.example.wsservice.jax_ws.cxf.service;


import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @ProjectName:
 * @Package: com.example.webservice.jdk
 * @ClassName: WebServiceImpl
 * @Description: 使用 @WebService 注解标注 WebServiceI 接口的实现类 WebServiceImpl
 * @Author: Mr.Vincent
 * @CreateDate: 2020/3/15 15:34
 * @Version: 1.0.0
 */
@WebService
public class WebServiceImpl implements WebServiceI {

    //使用 @WebMethod 注解标注 WebServiceImpl 实现类中的方法
    @WebMethod
    @Override
    public String sayHello(String name) {
        System.out.println("WebService sayHello:" + name);
        return "sayHello" + name;
    }

    //operationName 定义发布接口中方法的名字
    @WebMethod(operationName = "webserviceSave")
    @Override
    public String save(String name, String pwd) {
        System.out.println("WebService save:" + name + "," + pwd);
        return "save Success";
    }
}



