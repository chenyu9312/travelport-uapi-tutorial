package com.travelport.service.system_v32_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:54:47.988-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "SystemService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/system_v32_0/System.wsdl",
                  targetNamespace = "http://www.travelport.com/service/system_v32_0") 
public class SystemService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/system_v32_0", "SystemService");
    public final static QName SystemtimePort = new QName("http://www.travelport.com/service/system_v32_0", "SystemtimePort");
    public final static QName SystemInfoPort = new QName("http://www.travelport.com/service/system_v32_0", "SystemInfoPort");
    public final static QName SystemPingPort = new QName("http://www.travelport.com/service/system_v32_0", "SystemPingPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/system_v32_0/System.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SystemService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/system_v32_0/System.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SystemService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SystemService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SystemService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SystemService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SystemService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SystemService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SystemTimePortType
     */
    @WebEndpoint(name = "SystemtimePort")
    public SystemTimePortType getSystemtimePort() {
        return super.getPort(SystemtimePort, SystemTimePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SystemTimePortType
     */
    @WebEndpoint(name = "SystemtimePort")
    public SystemTimePortType getSystemtimePort(WebServiceFeature... features) {
        return super.getPort(SystemtimePort, SystemTimePortType.class, features);
    }


    /**
     *
     * @return
     *     returns SystemInfoPortType
     */
    @WebEndpoint(name = "SystemInfoPort")
    public SystemInfoPortType getSystemInfoPort() {
        return super.getPort(SystemInfoPort, SystemInfoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SystemInfoPortType
     */
    @WebEndpoint(name = "SystemInfoPort")
    public SystemInfoPortType getSystemInfoPort(WebServiceFeature... features) {
        return super.getPort(SystemInfoPort, SystemInfoPortType.class, features);
    }


    /**
     *
     * @return
     *     returns SystemPingPortType
     */
    @WebEndpoint(name = "SystemPingPort")
    public SystemPingPortType getSystemPingPort() {
        return super.getPort(SystemPingPort, SystemPingPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SystemPingPortType
     */
    @WebEndpoint(name = "SystemPingPort")
    public SystemPingPortType getSystemPingPort(WebServiceFeature... features) {
        return super.getPort(SystemPingPort, SystemPingPortType.class, features);
    }

}
