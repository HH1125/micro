package cn.mldn.action;
 
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageAction {
	@Autowired
	private MessageSource messageSource ;
	@RequestMapping("/msg") 
	public String msg(Model model) {
		String message = this.messageSource.getMessage("welcome.msg", new Object[] {"高大师"}, Locale.getDefault()) ;
		model.addAttribute("msg", message) ; // 设置request属性内容
		return "message/message_show" ; 
	}
}
