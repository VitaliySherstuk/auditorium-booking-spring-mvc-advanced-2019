//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.18 at 01:55:06 AM MSK 
//


package beans.soap.classes;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tutorialspoint.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tutorialspoint.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetUserByUsernameResponse }
     * 
     */
    public GetUserByUsernameResponse createGetUserByUsernameResponse() {
        return new GetUserByUsernameResponse();
    }

    /**
     * Create an instance of {@link GetRemoveUserByIdResponse }
     * 
     */
    public GetRemoveUserByIdResponse createGetRemoveUserByIdResponse() {
        return new GetRemoveUserByIdResponse();
    }

    /**
     * Create an instance of {@link GetRemoveUserByIdRequest }
     * 
     */
    public GetRemoveUserByIdRequest createGetRemoveUserByIdRequest() {
        return new GetRemoveUserByIdRequest();
    }

    /**
     * Create an instance of {@link GetUserByUsernameRequest }
     * 
     */
    public GetUserByUsernameRequest createGetUserByUsernameRequest() {
        return new GetUserByUsernameRequest();
    }

    /**
     * Create an instance of {@link GetRegisterUserResponse }
     * 
     */
    public GetRegisterUserResponse createGetRegisterUserResponse() {
        return new GetRegisterUserResponse();
    }

    /**
     * Create an instance of {@link GetRegisterUserRequest }
     * 
     */
    public GetRegisterUserRequest createGetRegisterUserRequest() {
        return new GetRegisterUserRequest();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

}
