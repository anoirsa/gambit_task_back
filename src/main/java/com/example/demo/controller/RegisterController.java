package com.example.demo.controller;


import com.example.demo.dao.Register;
import com.example.demo.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/registers")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegisterController {
    private final RegisterService registerService;

    @GetMapping
    private List<Register> getAllRegistries() {
        return  registerService.getAllRegistries();
    };


}
