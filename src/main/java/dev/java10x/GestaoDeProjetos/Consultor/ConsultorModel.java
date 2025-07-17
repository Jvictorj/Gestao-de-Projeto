package dev.java10x.GestaoDeProjetos.Consultor;

import dev.java10x.GestaoDeProjetos.Projetos.ProjetosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tb_consultor")
@NoArgsConstructor
@AllArgsConstructor
@Data

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

}