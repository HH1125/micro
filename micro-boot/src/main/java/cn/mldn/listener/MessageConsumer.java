package cn.mldn.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	@RabbitListener(queues="mldn.microboot.queue")
	public void receveMessage(String text) {
		System.out.println("【消费处理】" + text);
	}
}
