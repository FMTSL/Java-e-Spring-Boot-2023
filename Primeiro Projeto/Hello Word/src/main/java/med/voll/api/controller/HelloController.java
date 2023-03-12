package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloFelipe")
public class HelloController {

    @GetMapping
    public String olaMundo(){
        return "Olá Felipe Matos! Bem vindo a IBM";
    }
}
