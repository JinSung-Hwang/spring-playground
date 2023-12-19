package jshwang.springplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

//@SpringBootApplication
//public class SpringPlaygroundApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringPlaygroundApplication.class, args);
//	}
//
//}


@SpringBootApplication
public class SpringPlaygroundApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringPlaygroundApplication.class, args);
		StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
		String val = template.opsForValue().get("testkey1");
		System.out.println(val);

		val = template.opsForValue().get("testkey2");
		System.out.println(val);
	}
}