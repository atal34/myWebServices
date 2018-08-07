package main;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Application;

@Path("/request")
public class TestWebService {
	
	@POST
	@Path("/simple")
	@Consumes(MediaType.TEXT_PLAIN)
	public String processTestRequest(String data)
	{	
		System.out.println("WS called");
		return "Sample, web service called : " + data;
	}
	
	@GET
	@Path("/{param}/ID/{param2}")
	public Response getMsg(@PathParam("param") String msg,@PathParam("param2") String msg2) {
 
		String output = "Jersey say : " + msg+ " ID = "+msg2;
 
		return Response.status(200).entity(output).build();
 
	}
	

}
