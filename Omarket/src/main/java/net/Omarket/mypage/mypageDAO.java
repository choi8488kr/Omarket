package net.Omarket.mypage;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class mypageDAO {

	@Autowired
	SqlSessionTemplate temp;
	
	public void mainInsert(mypageDTO dto) {
		temp.insert("main.add", dto);
	}//end
	
}//class END






