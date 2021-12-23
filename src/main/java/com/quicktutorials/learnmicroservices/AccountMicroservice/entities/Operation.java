package com.quicktutorials.learnmicroservices.AccountMicroservice.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="operations")
public class Operation {

    @Id
    @Column(name="ID")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String id;

    @Column(name="DATE")
    @Getter @Setter
    private Date date;

    @Column(name="VALUE")
    @NotNull
    @Getter @Setter
    private Double value;

    @Column(name="DESCRIPTION")
    @Getter @Setter
    private String description;

    @Column(name="FK_ACCOUNT1")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String fkAccount1;

    @Column(name="FK_ACCOUNT2")
    @Getter @Setter
    private String fkAccount2;

    @PrePersist
    void getTimeOperation() {
        this.date = new Date();
    }
}
