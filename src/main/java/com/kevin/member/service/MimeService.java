package com.kevin.member.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;

import com.kevin.member.domain.User;

/**
 * Sample MIME Service
 * @author Owner
 *
 */
@Path("/mime")
public class MimeService {
	
	@POST
	@Path("/member")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public User getStaticResponse(JSONObject object) throws Exception {
		
		String firstname = object.getString("firstname");
		String lastname = object.getString("lastname");
		
		User user = null;
		
		user = new User();
		user.setDob("09/19/2016");
		user.setEmail("kevinzengdev@gmail.com");
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setMobile("520397415");
		user.setOccupation("softwware engineer");
		
		return user;
	}
}
