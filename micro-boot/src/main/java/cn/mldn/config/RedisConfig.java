package cn.mldn.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
	@Resource(name="redisConnectionFactory") 
	private RedisConnectionFactory redisConnectionFactoryOne ;
	@Resource(name="redisConnectionFactoryTwo") 
	private RedisConnectionFactory redisConnectionFactoryTwo ;
	@Bean("redisOne") 
	public RedisTemplate<String, String> getRedisTemplateOne() { 
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
		redisTemplate.setKeySerializer(new StringRedisSerializer()); // key的序列化类型
		redisTemplate.setValueSerializer(new StringRedisSerializer()); // value的序列化类型
		redisTemplate.setConnectionFactory(this.redisConnectionFactoryOne);
		return redisTemplate; 
	}
	@Bean("redisTwo") 
	public RedisTemplate<String, String> getRedisTemplateTwo() { 
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
		redisTemplate.setKeySerializer(new StringRedisSerializer()); // key的序列化类型
		redisTemplate.setValueSerializer(new StringRedisSerializer()); // value的序列化类型
		redisTemplate.setConnectionFactory(this.redisConnectionFactoryTwo);
		return redisTemplate; 
	} 
	@Bean("redisConnectionFactory") 
	public RedisConnectionFactory getRedisConnectionFactoryOne(
			@Value("${myredis.redis-one.host}") String hostName,
			@Value("${myredis.redis-one.password}") String password,
			@Value("${myredis.redis-one.port}") int port,
			@Value("${myredis.redis-one.database}") int database,
			@Value("${myredis.redis-one.jedis.pool.max-active}") int maxActive,
			@Value("${myredis.redis-one.jedis.pool.max-idle}") int maxIdle,
			@Value("${myredis.redis-one.jedis.pool.min-idle}") int minIdle,
			@Value("${myredis.redis-one.jedis.pool.max-wait}") long maxWait) { // 是负责建立Factory的连接工厂类
		RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration() ;
		redisConfig.setHostName(hostName);
		redisConfig.setPort(port);
		redisConfig.setDatabase(database);
		redisConfig.setPassword(RedisPassword.of(password));
		JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.defaultConfiguration() ;
		jedisClientConfiguration.getPoolConfig().get().setMaxTotal(maxActive);
		jedisClientConfiguration.getPoolConfig().get().setMaxIdle(maxIdle);
		jedisClientConfiguration.getPoolConfig().get().setMinIdle(minIdle);
		jedisClientConfiguration.getPoolConfig().get().setMaxWaitMillis(maxWait);
		JedisConnectionFactory jedisFactory = new JedisConnectionFactory(redisConfig,jedisClientConfiguration);
		jedisFactory.afterPropertiesSet(); // 初始化连接池配置
		return jedisFactory; 
	}
	@Bean("redisConnectionFactoryTwo")
	public RedisConnectionFactory getRedisConnectionFactoryTwo(
			@Value("${myredis.redis-two.host}") String hostName,
			@Value("${myredis.redis-two.password}") String password,
			@Value("${myredis.redis-two.port}") int port,
			@Value("${myredis.redis-two.database}") int database,
			@Value("${myredis.redis-two.jedis.pool.max-active}") int maxActive,
			@Value("${myredis.redis-two.jedis.pool.max-idle}") int maxIdle,
			@Value("${myredis.redis-two.jedis.pool.min-idle}") int minIdle,
			@Value("${myredis.redis-two.jedis.pool.max-wait}") long maxWait) { // 是负责建立Factory的连接工厂类
		RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration() ;
		redisConfig.setHostName(hostName);
		redisConfig.setPort(port);
		redisConfig.setDatabase(database);
		redisConfig.setPassword(RedisPassword.of(password));
		JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.defaultConfiguration() ;
		jedisClientConfiguration.getPoolConfig().get().setMaxTotal(maxActive);
		jedisClientConfiguration.getPoolConfig().get().setMaxIdle(maxIdle);
		jedisClientConfiguration.getPoolConfig().get().setMinIdle(minIdle);
		jedisClientConfiguration.getPoolConfig().get().setMaxWaitMillis(maxWait);
		JedisConnectionFactory jedisFactory = new JedisConnectionFactory(redisConfig,jedisClientConfiguration);
		jedisFactory.afterPropertiesSet(); // 初始化连接池配置
		return jedisFactory; 
	}
}
