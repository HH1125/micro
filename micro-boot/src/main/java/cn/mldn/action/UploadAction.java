package cn.mldn.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadAction {
	@ResponseBody 
	@RequestMapping(path = "/upload", method = RequestMethod.POST)
	public Object upload(MultipartFile photo) { // 上传接收
		return photo ;
	}
	@RequestMapping("/upload_pre")
	public String uploadPre() {
		return "upload/upload" ;
	}
}
