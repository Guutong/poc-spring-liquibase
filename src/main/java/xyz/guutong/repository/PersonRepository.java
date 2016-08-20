package xyz.guutong.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.guutong.model.Person;

public interface PersonRepository extends CrudRepository<Person,Integer> {
}
