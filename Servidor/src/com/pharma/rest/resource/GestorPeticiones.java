package com.pharma.rest.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


public class GestorPeticiones implements Runnable {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String estadoServidor(){
		return "El servidor esta online.";
	}
	
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
