package jshwang.springplayground.repository;

import java.util.Optional;
import jshwang.springplayground.domain.Person;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@RequiredArgsConstructor
public class RedisRepositoryTest {
  @Autowired
  private PersonRedisRepository repo;

  @Test
  void test() {
    Person person = new Person("Park", 20);
    System.out.println("person = " + person);

    // 저장
    repo.save(person);

    // `keyspace:id` 값을 가져옴
    Optional<Person> foundPerson = repo.findById(person.getId());
    System.out.println("foundPerson = " + foundPerson);

    // Person Entity 의 @RedisHash 에 정의되어 있는 keyspace (people) 에 속한 키의 갯수를 구함
    repo.count();

    // 삭제
//    repo.delete(person);
  }
}