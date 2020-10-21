package net.Omarket.login;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class loginDAO {

	@Autowired
	SqlSessionTemplate temp;
	
	public void loginInsert(loginDTO dto) {
		temp.insert("login.add", dto);
	}//end
	
}//class END






