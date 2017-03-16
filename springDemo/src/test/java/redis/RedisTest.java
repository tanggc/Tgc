package redis;

import redis.clients.jedis.Jedis;

public class RedisTest {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("172.17.118.207",6379);
		jedis.set("name", "TGC");
		String name = jedis.get("name");
		System.out.println("name:"+name);
		jedis.close();
	}

}
