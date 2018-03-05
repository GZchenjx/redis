package com.jx;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2018/3/5.
 */
public class RedisTest {
    @Test
    public void RedisTest() {
        Jedis jedis = new Jedis("localhost",6379);
        jedis.set("赣州技师学院","高级程序设计2班");
        System.out.println(jedis.get("赣州技师学院"));
    }
}
