package org.peli.RestPro.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/messageservice")
public class MessageService {
	
	MessageDao messageDao=new MessageDao();
	
	@Path("/messages")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessages(){
		System.out.println("A");
		return messageDao.getAll();
	
	}
	
	   @GET
	   @Path("/{messageid}")
	   @Produces(MediaType.APPLICATION_JSON)
	public Message getMessageById(@PathParam("msgid")int id){
		return messageDao.getById(id);
	}

}