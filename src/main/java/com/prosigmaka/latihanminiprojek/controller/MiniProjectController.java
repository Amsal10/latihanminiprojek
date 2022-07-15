package com.prosigmaka.latihanminiprojek.controller;

import com.prosigmaka.latihanminiprojek.model.dto.DefaultResponse;
import com.prosigmaka.latihanminiprojek.model.dto.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/miniprojek")
public class MiniProjectController {

    @PostMapping("/login")
    public DefaultResponse login(@RequestBody LoginDto loginDto){

        DefaultResponse df = new DefaultResponse();
        df.setStatus(Boolean.TRUE);
        df.setMessage("Login Berhasil");

        return df;

    }
}
