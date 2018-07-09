package cn.mldn.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.StartBootMain;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration // Spring需要启动容器才可以测试
@SpringBootTest(classes = StartBootMain.class)
public class TestRedisTemplate { 
	@Resource(name="redisOne") 
	private RedisTemplate<String,String> redisTemplate ; 
	@Test
	public void testSet() {
		this.redisTemplate.opsForValue().set("mldn", "java");
		System.out.println(this.redisTemplate.opsForValue().get("mldn"));
	}
}
