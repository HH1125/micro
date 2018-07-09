package cn.mldn.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	@KafkaListener(topics= {"mldn-microboot"})
	public void receveMessage(ConsumerRecord<String, String> record) {
		System.out.println("【消费处理】key = " + record.key() + "、value = " + record.value());
	} 
}
