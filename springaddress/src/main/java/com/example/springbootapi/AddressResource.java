package com.example.springbootapi;

import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.repository.query.Param;
import org.springframework.data.web.JsonPath;
@Path("address")
public class AddressResource {
	AddressRepository repo=new AddressRepository();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Address> getAddress() 
	{
       return repo.getAddress();
	}
	
	
	     
	@Target
	@JsonPath("address1/{zip}")
	@Produces(MediaType.APPLICATION_JSON)
	public  Address getAddress1(@Param("zip") int zip)
	{
		return repo.getAddress(zip);
		
	}
	

}
