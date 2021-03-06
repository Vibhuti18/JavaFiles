package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tienda.bean.Product;
import com.tienda.bean.Wishlist;
import com.tienda.service.TiendaService;
import com.tienda.util.WishlistNotFoundException;

public class WishlistResource {

	@GET
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) //MIME type/Media Type
	public Wishlist fetchWishlistForUser(@PathParam("uname")String username) throws WishlistNotFoundException{
		//Read Op
	Wishlist wishlist;
	wishlist = new TiendaService().getWishlistForUser(username);
	return wishlist;
	}
	
	@POST
	@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createWishlist(Product product) throws URISyntaxException {
		//Create op
		System.out.println("Product added to wish list");
		return Response.created(new URI("http://localhost:8080/tienda")).build();
	}
	
	@PUT
	@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("{add}")
	public void addToWishlist(@PathParam("uname")String username) throws WishlistNotFoundException{
		
		Product product = new Product(101010, "741852", "Nike", "sweatshirt", 4500);
		new TiendaService().addToWishlistForUser(username, product);
	}
	
	@PUT
	@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("{del}")
	public void removeFromWishlist(@PathParam("uname")String username,@PathParam("pid")int productId) throws WishlistNotFoundException{
		new TiendaService().removeFromWishlistForUser(username,productId);
	}
	
	
	
	
	
}
