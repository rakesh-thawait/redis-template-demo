# redis-template-demo
This project demonstrates the usage of RedisTemplate to save the cache.

### Redis
Redis (Remote Dictionary Server) is a fast, open-source, in-memory, key-value data store. Redis is used as a database, cache, message broker, and queue.

### RedisTemplate 
RedisTemplate provides a thread-safe bridge between Spring and Redis Commands. It handles connection management, freeing the developer from opening and closing Redis connections.


### @RedisHash

The entity for Redis is exactly the same as any other Entity. The only difference is RedisHash annotation, which marks Objects as aggregate roots to be stored in a Redis hash. 

<img width="828" alt="image" src="https://github.com/rakesh-thawait/redis-template-demo/assets/43513528/7537fecb-bf96-421b-ab13-05cc519096ad">
