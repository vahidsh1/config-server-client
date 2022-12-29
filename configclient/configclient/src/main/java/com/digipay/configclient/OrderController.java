package com.digipay.configclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/digital")
public class OrderController {
    @Value("${test.user.name}")
    String user;

    @GetMapping("/list")
    public void getProductsList() throws JsonProcessingException {
        System.out.println(user);
    }
}