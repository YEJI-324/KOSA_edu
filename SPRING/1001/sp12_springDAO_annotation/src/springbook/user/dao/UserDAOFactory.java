package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDAOFactory {
	
	@Bean
	public UserDAO userDao() {
		UserDAO dao = new UserDAO(connectionMaker());
		//UserDAO dao = new UserDAO();
		return dao;
	}

	@Bean
	public ConnectionMaker connectionMaker() {
		ConnectionMaker connectionMaker = new NConnectionMakerImpl();
		
		return connectionMaker;
	}
}




