package dev.wfrsilva.cadastrodeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem-vindo. Primeira mensagem.";
    }// boasVindas

    @GetMapping("/")
    public String inicio(){
        return "Inicio (index).";
    }//inicio

}// NinjaController
