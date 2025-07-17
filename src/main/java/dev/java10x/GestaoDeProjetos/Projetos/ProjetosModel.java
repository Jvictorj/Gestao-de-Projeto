package dev.java10x.GestaoDeProjetos.Projetos;

import dev.java10x.GestaoDeProjetos.Consultor.ConsultorModel;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_projeto")

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

    public ProjetosModel() { }

    public ProjetosModel(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFimPrevista, StatusDoProjeto status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFimPrevista = dataFimPrevista;
        this.status = status;
    }

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio () {
        return dataInicio;
    }

    public void setDataInicio (LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFimPrevista () {
        return dataFimPrevista;
    }

    public void setDataFimPrevista (LocalDate dataFimPrevista) {
        this.dataFimPrevista = dataFimPrevista;
    }

    public StatusDoProjeto getStatus () {
        return status;
    }

    public void setStatus (StatusDoProjeto status) {
        this.status = status;
    }

}
