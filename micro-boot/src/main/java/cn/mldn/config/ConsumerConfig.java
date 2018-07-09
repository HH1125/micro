package cn.mldn.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class ConsumerConfig {
//	public static final String EXCHANGE = "mldn.microboot.exchange" ;
//	public static final String ROUTINGKEY = "mldn.microboot.routingkey" ;
//	public static final String QUEUE = "mldn.microboot.queue" ; 
//	@Bean(name="consumerBind")
//	public Binding bindExchangeQueue(DirectExchange exchange,Queue queue) {
//		return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY) ; 
//	}
//	@Bean(name="consumerExchange")
//	public DirectExchange getDirectExchange() {
//		return new DirectExchange(EXCHANGE, true, true);
//	}
//	@Bean(name="consumerQueue") 
//	public Queue queue() {
//		return new Queue(QUEUE) ;
//	}
//}
