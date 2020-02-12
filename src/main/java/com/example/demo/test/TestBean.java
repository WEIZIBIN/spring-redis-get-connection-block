package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author weizibin
 * @since 2020/2/11 下午4:50
 */
@Service
public class TestBean {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostConstruct
    public void init() {
        String s = stringRedisTemplate.opsForValue().get("gateway:ab-test:config");
        System.out.println(s);
    }
}
