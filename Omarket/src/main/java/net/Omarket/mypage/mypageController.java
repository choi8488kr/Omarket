package net.Omarket.mypage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mypageController {
	
	private static final Logger logger = LoggerFactory.getLogger(mypageController.class);
	
	@RequestMapping(value = "/mypage.do", method = RequestMethod.GET)
	public String mypage(Model model) {
		
		return "mypage";
	}//end
	
}//class END
