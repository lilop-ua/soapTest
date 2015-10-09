
package com.kolhun.generated.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import com.kolhun.generated.server.HelloWebServiceImplService;
import com.kolhun.generated.server.HelloWebservice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-10-08T19:04:48.244+03:00
 * Generated source version: 3.0.1
 * 
 */
public final class HelloWebservice_HelloWebServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.kolhun.com/", "HelloWebServiceImplService");

    private HelloWebservice_HelloWebServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = HelloWebServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        HelloWebServiceImplService ss = new HelloWebServiceImplService(wsdlURL, SERVICE_NAME);
        HelloWebservice port = ss.getHelloWebServiceImplPort();
        
        {
        System.out.println("Invoking sayHello...");
        java.lang.String _sayHello_name = "";
        java.lang.String _sayHello__return = port.sayHello(_sayHello_name);
        System.out.println("sayHello.result=" + _sayHello__return);


        }

        System.exit(0);
    }

}
