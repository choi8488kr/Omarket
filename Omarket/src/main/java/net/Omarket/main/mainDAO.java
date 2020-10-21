package net.Omarket.main;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class mainDAO {

	@Autowired
	SqlSessionTemplate temp;
	
	public void mainInsert(mainDTO dto) {
		temp.insert("main.add", dto);
	}//end
	
}//class END






