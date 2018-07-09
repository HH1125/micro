package cn.mldn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.StartBootMain;
import cn.mldn.service.IMessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration	// Spring需要启动容器才可以测试
@SpringBootTest(classes=StartBootMain.class)
public class TestMessageService {
	private static final Logger LOG = LoggerFactory.getLogger(TestMessageService.class) ;
	static {
		System.setProperty("java.security.auth.login.config",
				"d:/kafka/kafka_client_jaas.conf"); 
	}
	@Autowired
	private IMessageService messageService ;
	@Test
	public void testSend() throws Exception {
		this.messageService.send("nice", "www.mldn.cn"); 
	}
}
