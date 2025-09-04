package dev.wfrsilva.cadastrodeNinjas.Missoes;

import java.util.List;

import dev.wfrsilva.cadastrodeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy="missoes")
    private List<NinjaModel> ninjas;

    public String getNome(){
        return this.nome;
    }//getNome

    public String getDificuldade(){
        return this.dificuldade;
    }//getDificuldade

    public List<NinjaModel> getNinjas(){
        return this.ninjas;
    }//getNinjaModels

    public void setNome(String nome){
        this.nome = nome;
    }//setNome

    public void setDificuldade(String dificuldade){
        this.dificuldade = dificuldade;
    }//setDificuldade

    public void setNinjas(List<NinjaModel> ninjas){
        this.ninjas = ninjas;
    }//setNinjas

}//MissaoModel
