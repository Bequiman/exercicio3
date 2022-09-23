package com.example.exercicio3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/texto")
    public String a(){
        return "texto";
    } 
    
    @GetMapping("/imagens")
    public String b(){
        return "imagens";
    }    
        
}