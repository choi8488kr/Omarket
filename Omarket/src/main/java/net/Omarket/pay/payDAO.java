package net.Omarket.pay;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class payDAO {

	@Autowired
	SqlSessionTemplate temp;
	
	public void payInsert(payDTO dto) {
		temp.insert("pay.add", dto);
	}//end
	
}//class END






