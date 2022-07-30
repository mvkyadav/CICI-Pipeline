package com.vamshi.cicdspring;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "gaurdian_name")
        ), @AttributeOverride(
                name = "email",
                column = @Column(name = "gaurdian_emailId")
        ), @AttributeOverride(
                name = "number",
                column = @Column(name = "gaurdian_number")
        )
        }
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gaurdian {

    private String name;
    private String email;
    private String number;
}
