package jshwang.springplayground.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@ToString
@Getter
@RedisHash(value = "people", timeToLive = 1000)
public class Person {

  @Id
  private String id;
  private String name;
  private Integer age;
  private LocalDateTime createdAt;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
    this.createdAt = LocalDateTime.now();
  }
}
