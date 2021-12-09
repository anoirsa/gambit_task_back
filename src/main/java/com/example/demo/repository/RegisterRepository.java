package com.example.demo.repository;


import com.example.demo.dao.Register;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class RegisterRepository {
    private List<Register> DB;

    public RegisterRepository() {
        DB = Parsing.parseTxtFile();
    }

    public List<Register> getAllRegistries() {
        return DB;
    }


}
