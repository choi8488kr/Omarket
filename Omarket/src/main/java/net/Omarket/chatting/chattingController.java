package net.Omarket.chatting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class chattingController {
	
	private static final Logger logger = LoggerFactory.getLogger(chattingController.class);
	
	@RequestMapping(value = "/chatting.do", method = RequestMethod.GET)
	public String chatting(Model model) {
		
		return "chatting";
	}//end
	
}//class END
