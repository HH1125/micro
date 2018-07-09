package cn.mldn.action;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.vo.Message;

@Controller
public class MessageAction {
	@RequestMapping("/msg") 
	public String msg(Model model) {
		model.addAttribute("age", 18) ;
		model.addAttribute("name", "mldn") ;
		List<Message> allMessages = new ArrayList<Message>() ;
		for (int x = 0 ; x < 10 ; x ++) {
			Message msg = new Message() ;
			msg.setMid(101L);
			msg.setTitle("高大师今晚要回国 - x" + x);
			msg.setNote("回国开坛做法，为特朗普招魂，重新引导世界人民走向共同繁荣。");
			msg.setPrice(982929.99);
			msg.setPub(new Date());
			allMessages.add(msg) ;
		}
		model.addAttribute("allMsgs", allMessages) ;  
		return "message" ;  
	}
}
