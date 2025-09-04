package dev.wfrsilva.cadastrodeNinjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel(){
    }// construtor vazio

    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }// construtor completo


    public String getNome(){
        return this.nome;
    } //getNome

    public String getEmail(){
        return this.email;
    } //getEmail

    public int getIdade(){
        return this.idade;
    }//getIdade

    public void setNome(String nome){
        this.nome = nome;        
    }//setNome

    public void setEmail(String email){
        this.email = email;
    }//setEmail

    public void setIdade(int idade){
        this.idade = idade;
    }//setIdade

} //NinjaModel
