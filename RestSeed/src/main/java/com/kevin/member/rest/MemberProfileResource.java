package com.kevin.member.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kevin.member.domain.Friend;
import com.kevin.member.domain.User;
import com.kevin.member.enums.Status;
import com.kevin.member.service.MemberProfileService;
import com.kevin.member.vo.MemberVo;
import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Controller
@Path("/profile")
public class MemberProfileResource {
	
	@Autowired
	MemberProfileService memberProfileService;
	
	/**
	 * @deprecated
	 */
	@GET
	@Path("/firstMessage")
	public Response getMyFirstHelloMessage() {
		
		String message = "this is my first message";
		
		return Response.status(200).entity(message).build();
	}
	
	/**
	 * @deprecated
	 */
	@GET
	@Path("/secondMessage")
	public String getMySecondHelloMessage(@QueryParam("firstname") String firstName, @QueryParam("lastName") String lastName) {
		
		String message = "this is second message for: " + firstName + " " + lastName;
		return message;
	}
	
	/**
	 * @deprecated
	 */
	@POST
	@Path("/{name}")
	public String postMyFirstHelloMessage(@PathParam("name") String name) {
		
		String message = "this is a message posted for: " + name;
		
		return message;
	}
	
	@GET
	@Path("/member/{memberId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Response getMemberProfile(@PathParam("memberId") String memberId) {
		
		MemberVo memberVo = new MemberVo();
		
		User user = memberProfileService.getMemberProfile(memberId);
		List<Friend> friendList = memberProfileService.getMemberFriendList(memberId);
		
		// TODO, DozerUtil Implementation
		memberVo.setMemberId(user.getUserId());
		memberVo.setMemberDOB(user.getDob());
		memberVo.setMemberEmail(user.getEmail());
		memberVo.setMemberFirstName(user.getFirstName());
		memberVo.setMemberLastName(user.getLastName());
		memberVo.setOccupation(user.getOccupation());
		memberVo.setRole(user.getRole());
		memberVo.setFriendsList(friendList);
		memberVo.setStatus(Status.ACTIVE);
		
		return Response.status(Response.Status.OK).entity(memberVo).build();
	}
}
