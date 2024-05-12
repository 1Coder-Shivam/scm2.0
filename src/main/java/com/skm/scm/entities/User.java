package com.skm.scm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "user")
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private Long id;

    @Column(name = "user_name",nullable = false)
    private String name;

    @Column(unique = true,nullable = false)
    private String email;
    private String password;

    @Column(length = 1000)
    private String about;

    @Column(length = 1000)
    private String profilePic;
    private String phoneNumber;

    private boolean enabled=false;
    private boolean emailVerified=false;
    private boolean phoneVerified=false;

    private Providers provider= Providers.SELF;
    private String providerUserId;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();

}
