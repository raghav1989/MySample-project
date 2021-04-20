package org.peli.RestPro.messenger;

import java.util.List;

import org.apache.ibatis.annotations.*;

public interface Messagedb_mapper {
	
	//final String getAll = "SELECT * FROM MSGDB";
	//final String getById = "SELECT * FROM MSGDB WHERE MSGDB_ID = #{msgdb_id}";
	
	 //getting all the message_database details
	 @Select("SELECT * FROM MSGDB")
	   @Results({
	      @Result(id=true,property = "msgdb_id", column = "MSGDB_ID"),
	      @Result(property = "queue_id", column = "QUEUEID"),
	      @Result(property = "message_no", column = "MESSAGENO"),
	      @Result(property = "messageclass_type", column = "MESSAGECLASSTYPE"),   
	      @Result(property = "status", column = "STATUS"), 
	      @Result(property = "input_date", column = "INPUTDATE"),
	      @Result(property = "input_time", column = "INPUTTIME"),
	      @Result(property = "currentqueuein_date", column = "CURRQUEUEINDATE"),
	      @Result(property = "currentqueuein_time", column = "CURRQUEUEINTIME"),
	      @Result(property = "prevqueuein_date", column = "PREVQUEUEINDATE")
	      
	      
	   })
	public   List<Message> getAll();
	 
	 
	//getting message_database details by id  
	 @Select("SELECT * FROM MSGDB WHERE MSGDB_ID = #{msgdb_id}" )
//	   @Results({
//	      @Result(id=true,property = "msgdb_id", column = "MSGDB_ID"),
//	      @Result(property = "queue_id", column = "QUEUEID"),
//	      @Result(property = "message_no", column = "MESSAGENO"),
//	      @Result(property = "messageclass_type", column = "MESSAGECLASSTYPE"),   
//	      @Result(property = "status", column = "STATUS"), 
//	      @Result(property = "input_date", column = "INPUTDATE"),
//	      @Result(property = "input_time", column = "INPUTTIME"),
//	      @Result(property = "currentqueuein_date", column = "CURRQUEUEINDATE"),
//	      @Result(property = "currentqueuein_time", column = "CURRQUEUEINTIME"),
//	      @Result(property = "prevqueuein_date", column = "PREVQUEUEINDATE")
//	      
//	   })
	public Message getById(int msgdb_id);
	
	}
