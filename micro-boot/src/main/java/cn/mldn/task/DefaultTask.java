package cn.mldn.task;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DefaultTask {
	@Scheduled(fixedRate=1000)
	public void runJobA() throws Exception {
		TimeUnit.SECONDS.sleep(5);
		System.out.println("【A - 间隔调度】执行任务调度：www.mldn.cn - " + System.currentTimeMillis() );
	}
	@Scheduled(cron="* * * * * ?") 
	public void runJobB() {
		System.out.println("【B - CRON调度】执行任务调度：www.mldn.cn - " + System.currentTimeMillis() );
	}
}
