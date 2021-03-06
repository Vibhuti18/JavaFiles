package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tienda.bean.Orders;
import com.tienda.service.TiendaService;
import com.tienda.util.OrderNotFoundException;

public class OrderResource {
	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// MIME type/Media Type
	@Path("order-num")
	public Orders fetchOrderDetailsForUser(@PathParam("uname")String username,
			@PathParam("order-num") String number)
			throws OrderNotFoundException {
		Orders order;
		order = new TiendaService().getOrderDetailsForUser(username, number);
		return order;

	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// MIME type/Media Type
	public Set<Orders> fetchAllOrdersforUser(@PathParam("uname")String username){
		Set<Orders> orders;
		orders = new TiendaService().getAllOrdersForUser(username);
		return orders;

	}

	@POST
	@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createOrder(Orders order) throws URISyntaxException {
		System.out.println("Order created");
		return Response.created(new URI("http://localhost:8080/tienda")).build();
	}

}
