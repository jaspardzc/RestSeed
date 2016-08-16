package com.kevin.member.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {
	
	
	@GET
	@Path("/firstMessage")
	public Response getMyFirstHelloMessage() {
		
		String message = "this is my first message";
		
		return Response.status(200).entity(message).build();
	}
	
	@GET
	@Path("/secondMessage")
	public String getMySecondHelloMessage(@QueryParam("firstname") String firstName, @QueryParam("lastName") String lastName) {
		
		String message = "this is second message for: " + firstName + " " + lastName;
		return message;
	}

	@POST
	@Path("/{name}")
	public String postMyFirstHelloMessage(@PathParam("name") String name) {
		
		String message = "this is a message posted for: " + name;
		
		return message;
	}
}
