package org.peli.RestPro.messenger;

import java.util.List;

public interface DatabaseMapper {
	
	public Message getById(int msgdb_id);
	
	 
	
	 public List<Message> getAll();


}
