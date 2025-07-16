package dev.java10x.GestaoDeProjetos;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_cadastro_projeto")

public class ProjetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titulo;
    String descricao;
    LocalDate dataInicio;
    LocalDate dataFimPrevista;
    StatusDoProjeto status;

    public ProjetoModel () { }

    public ProjetoModel (String titulo, String descricao, LocalDate dataInicio, LocalDate dataFimPrevista, StatusDoProjeto status) {
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
