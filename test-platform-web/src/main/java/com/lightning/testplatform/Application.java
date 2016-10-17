package com.lightning.testplatform;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by mingxin on 16/8/7.
 */

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Application implements CommandLineRunner {

//    @Autowired
//    private PeopleMapper peopleMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        People people = this.peopleMapper.selectById(1L);
//        System.out.println(getPeopleById(1L));
        System.out.println("test platform start up!");
    }

//    @Autowired
//    PeopleMapper peopleMapper;
//
//    public People getPeopleById(Long id) {
//        return peopleMapper.selectById(id);
//    }
}

