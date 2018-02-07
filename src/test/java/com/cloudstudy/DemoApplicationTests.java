package com.cloudstudy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Test
	public void test() throws Exception {
		// 保存字符串
		log.debug("----------debug-----------");
		log.info("-----------info------------");
//		stringRedisTemplate.opsForValue().set("aaa", "111");
//		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}
}
