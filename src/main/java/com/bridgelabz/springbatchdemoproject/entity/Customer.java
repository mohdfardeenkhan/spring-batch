package com.bridgelabz.springbatchdemoproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "customer_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String eMail;
    @Column(name = "gender")
    private String gender;
    @Column(name = "contact")
    private String contact;
    @Column(name = "country")
    private String country;
    @Column(name = "dob")
    private String dob;
}
