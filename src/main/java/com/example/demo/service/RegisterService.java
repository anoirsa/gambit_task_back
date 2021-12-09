package com.example.demo.service;


import com.example.demo.dao.Register;
import com.example.demo.repository.RegisterRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Getter
public class RegisterService {

    private final RegisterRepository registerRepository;

    public List<Register> getAllRegistries() {
        return  registerRepository.getAllRegistries();
    };


}
