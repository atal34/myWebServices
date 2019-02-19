package requests;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;


import com.sun.jersey.core.util.Base64;

@Path("/request")
public class RequestManager
{
	
	
	@POST
	@Path("/simple")
	public String processTestRequest(String data)
	{
		return "Hello, Web Service called... Received data : " + data;
		//sample request
	}
	
	@GET
	@Path("/simple2")
	public String processTestRequest2()
	{
		return "Hello, Atal Web Service called... ";
	}
	
	}
