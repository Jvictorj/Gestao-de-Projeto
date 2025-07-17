package dev.java10x.GestaoDeProjetos.Projetos;

import dev.java10x.GestaoDeProjetos.Consultor.ConsultorModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_projeto")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProjetosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFimPrevista;
    private StatusDoProjeto status;

    // Um projeto pode ter varios consultores
    @OneToMany(mappedBy = "projetos")
    private List<ConsultorModel> consultores;

}
