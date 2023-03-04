package com.asjy.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * ClassName: Test
 * Package: com.asjy.redis
 * Description:
 *
 * @Author 梓维李
 * @Create 2023/2/26 18:29
 * @Version 2.0
 */
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate ;


   @Test
    void test01(){
       redisTemplate.opsForValue().set("nameaa","xiaolan");
       Object name = redisTemplate.opsForValue().get("nameaa");
       System.out.println(name);
   }
}
