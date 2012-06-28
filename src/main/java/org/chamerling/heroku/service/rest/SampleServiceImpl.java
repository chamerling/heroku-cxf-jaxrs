/**
 * 
 */
package org.chamerling.heroku.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.chamerling.heroku.service.rest.beans.SampleBean;
import org.chamerling.heroku.service.rest.beans.SampleBeans;

/**
 * @author chamerling
 * 
 */
public class SampleServiceImpl implements SampleService {

	@Override
	public String ping() {
		return "pong";
	}

	@Override
	public Response list() {
		List<SampleBean> list = new ArrayList<SampleBean>();
		for (int i = 0; i < 10; i++) {
			list.add(new SampleBean("name-" + i, "" + i));
		}
		return Response.ok(new SampleBeans(list)).build();
	}

	@Override
	public Response query(String parameter) {
		return Response.ok(new SampleBean("queryparam", parameter)).build();
	}

	@Override
	public Response path(String id) {
		return Response.ok(new SampleBean("pathparam", id)).build();
	}

}
