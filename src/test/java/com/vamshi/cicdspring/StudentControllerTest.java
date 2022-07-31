package com.vamshi.cicdspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentControllerTest {

    @Test
    void save() {
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

        Assertions.assertEquals(20, student.getAge());

    }
}