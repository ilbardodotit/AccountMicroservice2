package com.quicktutorials.learnmicroservices.AccountMicroservice.entities;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="accounts")
public class Account {

    @Id
    @Column(name="ID")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String id;

    @Column(name="FK_USER")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String fkUser;

    @Column(name="TOTAL")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String total;

}
