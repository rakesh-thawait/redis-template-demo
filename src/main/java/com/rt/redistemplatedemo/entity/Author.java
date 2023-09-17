package com.rt.redistemplatedemo.entity;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
public class Author {
    String name;
    int age;
}
