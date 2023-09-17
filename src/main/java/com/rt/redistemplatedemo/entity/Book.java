package com.rt.redistemplatedemo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


@Data
@RedisHash(timeToLive = 3600)
public class Book implements Serializable {

    @Id
    String id;

    String name;
    String isbn;
    Author author;
    @Transient
    int weight;

}
