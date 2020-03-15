package com.example.wsservice.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @ProjectName:
 * @Package: com.example.webservice.jdk
 * @ClassName: WebServiceI
 * @Description:
 * @Author: Mr.Vincent
 * @CreateDate: 2020/3/15 15:31
 * @Version: 1.0.0
 */
@WebService
public interface WebServiceI {

    @WebMethod
    String sayHello(String name);

    @WebMethod(operationName = "webserviceSave")
    String save(String name, String pwd);

}
