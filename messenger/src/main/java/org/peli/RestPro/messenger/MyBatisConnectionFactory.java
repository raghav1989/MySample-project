package org.peli.RestPro.messenger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


//MyBatis Connection Factory, which reads the configuration data from a XML file.

public class MyBatisConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	
	public MyBatisConnectionFactory(){
		
	}

	static {
            Reader reader=null;
		try {

			reader = Resources.getResourceAsReader("OracleDbConfig.xml");

			}

		catch (FileNotFoundException fileNotFoundException) {
		
			fileNotFoundException.printStackTrace();
		}
		catch (IOException iOException) {
			iOException.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		System.out.println("c");

		return sqlSessionFactory;
	}

}
