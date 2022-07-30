package com.vamshi.cicdspring;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Student")
@Table(
        name = "Student",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique", columnNames = "email")
        }
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "id"
    )
    private long id;

    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )

    private String firstName;

    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;

    @Column(
            name = "age",
            nullable = false
    )
    private int age;

    @Column(
            name = "email",
            columnDefinition = "TEXT"
    )
    private String email;
    @Embedded
    private Gaurdian gaurdian;

}
