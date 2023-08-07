package egovframework.example.cmmn;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service("commonRedisService")
public class CommonRedisService implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private final RedisTemplate<String, Object> redisTemplate;

	@Autowired
    public CommonRedisService(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
    
    public void redisAddData(String key, Object value) {
    	redisTemplate.opsForValue().set(key, value);
    }
    
    public Object redisGetData(String key) {
    	return redisTemplate.opsForValue().get(key);
    }
}
