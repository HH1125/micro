package cn.mldn.action;
 
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.vo.Message;

@Controller
public class MessageAction {
	@RequestMapping("/msg") 
	public String msg(Model model) {
		Message msg = new Message() ;
		msg.setMid(101L);
		msg.setTitle("高大师今晚要回国");
		msg.setNote("回国开坛做法，为特朗普招魂，重新引导世界人民走向共同繁荣。");
		msg.setPrice(982929.99);
		msg.setPub(new Date());
		model.addAttribute("msg", msg) ; 
		return "message" ;  
	}
}
