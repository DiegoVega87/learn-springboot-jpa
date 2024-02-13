package com.learnjpaexample.jpalearningpractice.jpa;

import com.learnjpaexample.jpalearningpractice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UsersJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------UserJpaCommandLineRunner.run()-------------");

        repository.insert(new User(1, "Diego", "Admin"));
        repository.insert(new User(2, "Angie", "user1322"));
        repository.insert(new User(3, "Clara", "user1234"));
        repository.insert(new User(4, "Luis", "user1234"));
        repository.insert(new User(5, "Carlos", "user1234"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));

        repository.findAll().forEach(System.out::println);
    }
}
