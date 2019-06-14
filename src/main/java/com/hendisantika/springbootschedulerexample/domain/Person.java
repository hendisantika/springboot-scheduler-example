package com.hendisantika.springbootschedulerexample.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-scheduler-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-15
 * Time: 05:55
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String lastName;

    protected Person() {

    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name :" + this.name + " Surname :" + this.lastName;
    }
}