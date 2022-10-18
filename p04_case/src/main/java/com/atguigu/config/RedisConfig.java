package com.atguigu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

@Component
@Configuration
//修改redis序列化器
public class RedisConfig {
	@Autowired
	private RedisTemplate template;

	@Bean
	public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new Jackson2JsonRedisSerializer(Object.class));
		template.setHashKeySerializer(new StringRedisSerializer());
		template.setHashValueSerializer(new Jackson2JsonRedisSerializer(Object.class));
		return template;
	}
}
