package dev.java10x.GestaoDeProjetos.Consultor;

import dev.java10x.GestaoDeProjetos.Projetos.ProjetosModel;
import jakarta.persistence.*;

@Entity
@Table (name = "tb_consultor")

public class ConsultorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;
    private CargoDoConsultor cargo;

    //Varios consultores podem ter um mesmo projeto
    @ManyToOne
    @JoinColumn(name = "projetos_id") //chave estrangeira
    private ProjetosModel projetos;

    public ConsultorModel() { }

    public ConsultorModel(String nome, String email, int idade, CargoDoConsultor cargo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade () {
        return idade;
    }

    public void setIdade () {
        this.idade = idade;
    }

    public CargoDoConsultor getCargo () {
        return cargo;
    }

    public void setCargo (CargoDoConsultor cargo) {
        this.cargo = cargo;
    }


}