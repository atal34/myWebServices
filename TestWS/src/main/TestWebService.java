package main;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

@Path("/request")
public class TestWebService {
	
	@POST
	@Path("/simple")
	@Consumes(MediaType.TEXT_PLAIN)
	public String processTestRequest(String data)
	{
		return "Sample, web service called : " + data;
	}

}
