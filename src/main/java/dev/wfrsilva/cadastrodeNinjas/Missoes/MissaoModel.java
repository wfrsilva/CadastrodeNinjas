package dev.wfrsilva.cadastrodeNinjas.Missoes;

import java.util.List;

import dev.wfrsilva.cadastrodeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy="missoes")
    private List<NinjaModel> ninjas;

    public MissaoModel(){
    }// construtor vazio

    public MissaoModel(String nome, String dificuldade, List<NinjaModel> ninjas){
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninjas = ninjas;
    }//construtor completo

    public String getNome(){
        return this.nome;
    }//getNome

    public String getDificuldade(){
        return this.dificuldade;
    }//getDificuldade

    public void setNome(String nome){
        this.nome = nome;
    }//setNome

    public void setDificuldade(String dificuldade){
        this.dificuldade = dificuldade;
    }//setDificuldade


}//MissaoModel
