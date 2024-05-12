package com.skm.scm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    @Column(length = 1000)
    private String description;
    private boolean favorite=false;

    @ManyToOne
    private User user;

    private String websiteLink;
    private String linkedInLink;

    @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private List<SocialLink> links = new ArrayList<>();
}
