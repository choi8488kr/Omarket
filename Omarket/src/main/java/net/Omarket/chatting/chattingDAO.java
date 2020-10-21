package net.Omarket.chatting;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class chattingDAO {

	@Autowired
	SqlSessionTemplate temp;
	
	public void chattingInsert(chattingDTO dto) {
		temp.insert("chatting.add", dto);
	}//end
	
}//class END






