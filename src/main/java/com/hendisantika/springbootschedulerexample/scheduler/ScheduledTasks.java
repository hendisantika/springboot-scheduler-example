package com.hendisantika.springbootschedulerexample.scheduler;

import com.hendisantika.springbootschedulerexample.domain.Person;
import com.hendisantika.springbootschedulerexample.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-scheduler-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-15
 * Time: 05:56
 */
@Component
public class ScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Autowired
    PersonRepository personRepository;


    @Scheduled(fixedRate = 3000)
    public void scheduleWithFixedRate() {
        logger.info("Starting Scheduler.............................");
        Person person = new Person("Uzumaki", "Naruto");
        personRepository.save(person);

        logger.info("FindByLastName : " + personRepository.findByLastName("Uzumaki").get(0));
        logger.info("Fixed Rate Scheduler finished : " + dateTimeFormatter.format(LocalDateTime.now()));

    }

}