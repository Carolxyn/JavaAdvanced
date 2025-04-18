package br.com.fiap.contato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HellowController {
    @GetMapping("/hello")
    public String Hello(){
        return "hello world. ";

    }
    @GetMapping("/ola")
    public String Ola(){
        return "olá mundo. ";
    }
}
