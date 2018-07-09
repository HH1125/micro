package cn.mldn.action;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloAction {
	@ResponseBody
	@RequestMapping("/") 
	public String info() {
		return "www.mldn.cn" ;
	}
}
