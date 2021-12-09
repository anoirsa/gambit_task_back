package com.example.demo.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString

public class Register {

    private Integer registerNumber;
    private Double registerValue;


    public Register(Double registerValue, Integer registerNumber) {
        this.registerValue = registerValue;
        this.registerNumber = registerNumber;
    }
}
