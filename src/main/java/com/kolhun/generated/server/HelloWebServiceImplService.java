package com.kolhun.generated.server;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-10-08T19:04:48.296+03:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "HelloWebServiceImplService", 
                  wsdlLocation = "file:/D:/my_projs/soapTest/src/main/java/com/kolhun/generated/client/greeting.wsdl",
                  targetNamespace = "http://service.kolhun.com/") 
public class HelloWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.kolhun.com/", "HelloWebServiceImplService");
    public final static QName HelloWebServiceImplPort = new QName("http://service.kolhun.com/", "HelloWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/my_projs/soapTest/src/main/java/com/kolhun/generated/client/greeting.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWebServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/my_projs/soapTest/src/main/java/com/kolhun/generated/client/greeting.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWebServiceImplService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns HelloWebservice
     */
    @WebEndpoint(name = "HelloWebServiceImplPort")
    public HelloWebservice getHelloWebServiceImplPort() {
        return super.getPort(HelloWebServiceImplPort, HelloWebservice.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWebservice
     */
    @WebEndpoint(name = "HelloWebServiceImplPort")
    public HelloWebservice getHelloWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWebServiceImplPort, HelloWebservice.class, features);
    }

}
