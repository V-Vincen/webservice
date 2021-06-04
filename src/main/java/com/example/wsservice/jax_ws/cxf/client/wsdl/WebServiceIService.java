package com.example.wsservice.jax_ws.cxf.client.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-21T23:21:14.505+08:00
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "WebServiceIService",
                  wsdlLocation = "file:/Users/vincent/Idea_Project/webservice/src/main/java/com/example/wsservice/cxf/client/wsdl/cxf.wsdl",
                  targetNamespace = "http://service.cxf.wsservice.example.com/")
public class WebServiceIService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.cxf.wsservice.example.com/", "WebServiceIService");
    public final static QName WebServiceIPort = new QName("http://service.cxf.wsservice.example.com/", "WebServiceIPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/vincent/Idea_Project/webservice/src/main/java/com/example/wsservice/cxf/client/wsdl/cxf.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WebServiceIService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/vincent/Idea_Project/webservice/src/main/java/com/example/wsservice/cxf/client/wsdl/cxf.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WebServiceIService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebServiceIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceIService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WebServiceIService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WebServiceIService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WebServiceIService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WebServiceI
     */
    @WebEndpoint(name = "WebServiceIPort")
    public WebServiceI getWebServiceIPort() {
        return super.getPort(WebServiceIPort, WebServiceI.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceI
     */
    @WebEndpoint(name = "WebServiceIPort")
    public WebServiceI getWebServiceIPort(WebServiceFeature... features) {
        return super.getPort(WebServiceIPort, WebServiceI.class, features);
    }

}