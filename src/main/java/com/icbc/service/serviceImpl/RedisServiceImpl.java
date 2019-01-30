package com.icbc.service.serviceImpl;

import com.icbc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public String getInfo(String key) {
        return jedisCluster.get(key);
    }
}
