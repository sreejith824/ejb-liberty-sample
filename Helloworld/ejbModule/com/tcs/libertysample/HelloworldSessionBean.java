package com.tcs.libertysample;

import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

/**
 * Session Bean implementation class HelloworldSessionBean
 */
@HandlerChain(file = "handler-chain.xml")
@Stateless
@WebService
public class HelloworldSessionBean implements HelloworldSessionBeanRemote {

    /**
     * Default constructor. 
     */
    public HelloworldSessionBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String helloworld() {
    	return "Hello world!!!";
    }

}
