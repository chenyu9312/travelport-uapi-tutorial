package com.travelport.service.system_v32_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:54:47.981-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/system_v32_0", name = "ExternalCacheAccessPortType")
@XmlSeeAlso({com.travelport.schema.system_v32_0.ObjectFactory.class, com.travelport.schema.common_v32_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ExternalCacheAccessPortType {

    @WebResult(name = "ExternalCacheAccessRsp", targetNamespace = "http://www.travelport.com/schema/system_v32_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/ExternalCacheAccessService")
    public com.travelport.schema.system_v32_0.ExternalCacheAccessRsp service(
        @WebParam(partName = "parameters", name = "ExternalCacheAccessReq", targetNamespace = "http://www.travelport.com/schema/system_v32_0")
        com.travelport.schema.system_v32_0.ExternalCacheAccessReq parameters
    ) throws SystemFaultMessage;
}
