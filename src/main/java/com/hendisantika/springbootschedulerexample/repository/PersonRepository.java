package com.hendisantika.springbootschedulerexample.repository;

import com.hendisantika.springbootschedulerexample.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-scheduler-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-15
 * Time: 05:56
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByLastName(String surname);

}