package dev.java10x.GestaoDeProjetos;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_cadastro_consultor")

public class ConsultorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;
    CargoDoConsultor cargo;


    public ConsultorModel() {
    }

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
