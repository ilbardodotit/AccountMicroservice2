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

@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="ID")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String id;

    @Column(name="USERNAME")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String username;

    @Column(name="PASSWORD")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String password;

    @Column(name="PERMISSION")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String permission;

}
