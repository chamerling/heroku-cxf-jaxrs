/**
 * 
 */
package org.chamerling.heroku.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author chamerling
 * 
 */
@Path("/sample/")
public interface SampleService {

	/**
	 * Simple response
	 * 
	 * @return
	 */
	@GET
	@Path("ping")
	String ping();

	/**
	 * Response from JAXB beans
	 * 
	 * @return
	 */
	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_JSON)
	Response list();

	/**
	 * Get query parameters. ie call to /rest/query?foo=bar
	 * 
	 * @return
	 */
	@GET
	@Path("query")
	@Produces(MediaType.APPLICATION_JSON)
	Response query(@QueryParam("foo") String parameter);
	
	/**
	 * Call me at /rest/path/XXX
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("path/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	Response path(@PathParam("id") String id);

}
