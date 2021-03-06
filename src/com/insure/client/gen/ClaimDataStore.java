
package com.insure.client.gen;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClaimDataStore", targetNamespace = "http://server.insure.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClaimDataStore {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "claimToString", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClaimToString")
    @ResponseWrapper(localName = "claimToStringResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClaimToStringResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/claimToStringRequest", output = "http://server.insure.com/ClaimDataStore/claimToStringResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/claimToString/Fault/Exception")
    })
    public String claimToString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaim")
    @ResponseWrapper(localName = "createClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/createClaimRequest", output = "http://server.insure.com/ClaimDataStore/createClaimResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/createClaim/Fault/Exception")
    })
    public int createClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "editDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.EditDocument")
    @ResponseWrapper(localName = "editDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.EditDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/editDocumentRequest", output = "http://server.insure.com/ClaimDataStore/editDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/editDocument/Fault/Exception")
    })
    public void editDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ViewDocument")
    @ResponseWrapper(localName = "viewDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ViewDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/viewDocumentRequest", output = "http://server.insure.com/ClaimDataStore/viewDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/viewDocument/Fault/Exception")
    })
    public List<String> viewDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddDocument")
    @ResponseWrapper(localName = "addDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/addDocumentRequest", output = "http://server.insure.com/ClaimDataStore/addDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/addDocument/Fault/Exception")
    })
    public int addDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listDocuments", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ListDocuments")
    @ResponseWrapper(localName = "listDocumentsResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ListDocumentsResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/listDocumentsRequest", output = "http://server.insure.com/ClaimDataStore/listDocumentsResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/listDocuments/Fault/Exception")
    })
    public String listDocuments(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

}
