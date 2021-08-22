package com.sherwin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/calculateResult/{num}")
    public Integer calculateResult(@PathVariable("num") Integer num){
        return num^2;
    }

    @GetMapping("/getServerPort")
    public Integer getServerPort(){
        return port;
    }
}
