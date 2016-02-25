package co.com.ceiba.example.spring.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.ceiba.example.spring.domain.SignUpDomain;
import co.com.ceiba.example.spring.domain.model.Business;
import co.com.ceiba.example.spring.domain.model.User;

@Named
@Singleton
@Path("signup")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class SignUpService {

	@Inject
	SignUpDomain signUpDomain;
	
	@POST
	@Path("/user")
	public Response signUpUser(User user) {
		String result = signUpDomain.signUpUser(user);
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/business")
	public Response signUpBusiness(Business business) {
		String result = signUpDomain.signUpBusiness(business);
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/userandbusiness")
	public Response signUpUserAndBusiness(User user, Business business) {
		String result = signUpDomain.singUpUserAndBusiness(user, business);
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/users")
	public Response listUsers() {
		List<User> users = signUpDomain.getUsers();
		return Response.status(200).entity(users).build();
	}
	
	
}
