package com.pharma.rest.resource;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.pharma.rest.model.Farmacia;

@Path("/peticiones")
public class GestorPeticiones implements Runnable {
	
	@Context
	UriInfo uriInfo;
	
	@Context
	Request request;
	

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String estadoServidor(){
		return "El servidor esta online.";
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Farmacia> farmaciasCercanas(float x, float y){
		ArrayList<Farmacia> result = null;
		return  result;
	}
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
