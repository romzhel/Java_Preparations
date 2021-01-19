package ru.romzhel.lesson_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import ru.romzhel.lesson_7.services.StudentService;

@SpringBootApplication
public class MySpringBootJspApp extends SpringBootServletInitializer {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MySpringBootJspApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootJspApp.class, args);
    }
}
