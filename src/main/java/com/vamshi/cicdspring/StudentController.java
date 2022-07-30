package com.vamshi.cicdspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;

    @GetMapping("/save")
    public Student save() {
        Gaurdian gaurdian = Gaurdian
                .builder()
                .name("Sankirth")
                .email("s@123")
                .number("1323")
                .build();

//            Student vamshi = new Student("Vamshi", "Krishna", 20,
//                    "vamshi@gmail.com");
//            repository.save(vamshi);
        Student student = Student
                .builder()
                .firstName("Bharath")
                .lastName("Reddy")
                .age(20)
                .email("b@123")
                .gaurdian(gaurdian)
                .build();

            return repository.save(student);
    }

}
