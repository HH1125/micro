package cn.mldn.action;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.vo.Message;

@Controller
public class MessageAction {
	@RequestMapping("/msg")
	public String msg(Model model) {
		model.addAttribute("age", 18);
		model.addAttribute("name", "mldn");
		Message msg = new Message();
		msg.setMid(1L);
		msg.setTitle("高大师今晚要回国");
		msg.setNote("回国开坛做法，为特朗普招魂，重新引导世界人民走向共同繁荣。");
		msg.setPrice(19.8);
		msg.setPub(new Date());
		model.addAttribute("msg", msg);
		Set<String> set = new HashSet<String>();
		set.addAll(Arrays.asList("happy", "single", "man"));
		model.addAttribute("info", set);
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1th");
		map.put(2, "2th");
		model.addAttribute("line", map);
		return "message";
	}
}
