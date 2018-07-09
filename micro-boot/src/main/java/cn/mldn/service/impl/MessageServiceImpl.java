package cn.mldn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import cn.mldn.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate ;

	@Override
	public void send(String key,String value) {
		this.kafkaTemplate.sendDefault(key, value) ;
	}

}
