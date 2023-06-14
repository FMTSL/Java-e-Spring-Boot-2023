package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*Anotação usada para API Rest, para informar para o spring MVC que essa classe é um controller*/
@RequestMapping("/hello")/*Anotação para informar a url que o controller irá responder*/
public class HelloController {
    @GetMapping /*Anotação para informar qual método utilizado, no caso o método GET */
    public String olaMundo(){
        return "Olá Mundo!";
    }

}
