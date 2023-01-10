package com.javatechie.springbatchdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CUSTOMER_INFO")
public class Customer {

    @Id
    @Column(name="CUSTOMER_ID")
    private int id;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private int lastName;
    @Column(name="EMAIL")
    private String email;
    @Column(name="GENDER")
    private int gender;
    @Column(name="CONTACT")
    private String contactNo;
    @Column(name="COUNTRY")
    private int country;
    @Column(name="DOB")
    private String dob;
}
