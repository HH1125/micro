package cn.mldn.service.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mldn.config.ProducerConfig;
import cn.mldn.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void send(String msg) {
		this.rabbitTemplate.convertAndSend(ProducerConfig.EXCHANGE, ProducerConfig.ROUTINGKEY, msg);
	}

}
