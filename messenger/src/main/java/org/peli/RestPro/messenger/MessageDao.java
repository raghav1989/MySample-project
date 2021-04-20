package org.peli.RestPro.messenger;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;

public class MessageDao  {
	//private SqlSessionFactory sqlSessionFactory;

//	public MessageDao() {
//		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
//	}

	// Returns the list of all message instances from the database.
	 

	public List<Message> getAll() {
		System.out.println("B");

		SqlSession session = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		System.out.println("C");

		try {
			System.out.println("d");
			Messagedb_mapper list =session.getMapper(Messagedb_mapper.class);
			System.out.println("D");
			return list.getAll();
		} finally {
			session.close();
		}
	}

	
	//  Returns a message from the database.
	 

	public Message getById(int id) {

		SqlSession session = MyBatisConnectionFactory.getSqlSessionFactory().openSession();

		try {
			Messagedb_mapper message =  session.getMapper(Messagedb_mapper.class);

			return message.getById(id);
		} finally {
			session.close();
		}
	}
}

