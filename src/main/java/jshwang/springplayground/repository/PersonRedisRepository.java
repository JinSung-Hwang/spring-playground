package jshwang.springplayground.repository;

import jshwang.springplayground.domain.Person;
import org.springframework.data.repository.CrudRepository;
public interface PersonRedisRepository extends CrudRepository<Person, String> {
}
