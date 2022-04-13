package com.study.helloworld.test;

import com.study.helloworld.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonTest {
    @Autowired
    private Person person;

//    @Bean
    @RequestMapping("/getPerson")
    public Person getPerson(){
//        Person person = new Person();
        person.setName("xiaoming");
        person.setAge(15);
//        System.out.println(person.toString());
        return person;
    }
}
