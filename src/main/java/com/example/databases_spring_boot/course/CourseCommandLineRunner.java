package com.example.databases_spring_boot.course;

import com.example.databases_spring_boot.jpa.CourseJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//@Component
@Transactional
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Jpa!", "in28minutes"));
        repository.insert(new Course(2, "Learn Azure Jpa!", "in28minutes"));
        repository.insert(new Course(3, "Learn DevOps Jpa!", "in28minutes"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
