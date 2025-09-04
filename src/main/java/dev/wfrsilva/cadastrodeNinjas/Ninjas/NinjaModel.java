package dev.wfrsilva.cadastrodeNinjas.Ninjas;

import dev.wfrsilva.cadastrodeNinjas.Missoes.MissaoModel;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninjas")
public class NinjaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name= "missoes_id")//chave estrangeira
    private MissaoModel missoes;

    public NinjaModel(){
    }// construtor vazio

    public NinjaModel(String nome, String email, int idade, MissaoModel missoes){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missoes = missoes;
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

    public MissaoModel getMissoes(){
        return this.missoes;
    }//getMissoes

    public void setNome(String nome){
        this.nome = nome;        
    }//setNome

    public void setEmail(String email){
        this.email = email;
    }//setEmail

    public void setIdade(int idade){
        this.idade = idade;
    }//setIdade

    public void setMissoes(MissaoModel missoes){
        this.missoes = missoes;
    }//setMissoes

} //NinjaModel
