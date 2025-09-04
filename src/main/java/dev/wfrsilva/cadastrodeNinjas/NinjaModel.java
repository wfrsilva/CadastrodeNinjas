package dev.wfrsilva.cadastrodeNinjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel(){
    }// construtor vazio

    public Ninjamodel(String nome, Stirng email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }// construtor completo

} //NinjaModel
