package dev.java10x.GestaoDeProjetos.Projetos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projeto")

public class ProjetosController {

    @PostMapping("/criar")
    public String criarProjeto() {
        return "Criando um Projeto";
    }

    @GetMapping ("/listar")
    public String listarProjetos() {
        return "Mostra todos os projeto";
    }

    @GetMapping ("/listarId")
    public String listarProjetosPorId() {
        return "Mostra projeto por id";
    }

    @PutMapping("/alterar")
    public String alterarProjetoPorId() {
        return "alterando o projeto por id";
    }

    @DeleteMapping("/deletar")
    public String deletarProjetoPorId() {
        return "deletar projeto por id";
    }

}
