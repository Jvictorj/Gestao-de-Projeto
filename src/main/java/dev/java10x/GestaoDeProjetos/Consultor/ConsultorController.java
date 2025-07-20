package dev.java10x.GestaoDeProjetos.Consultor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultor")

public class ConsultorController {

    @PostMapping("/criar")
    public String criarConsultor () {
        return "Cadastre um Consultor";
    }

    @GetMapping("/listar")
    public String listarConsultores () {
        return "Mostrando todos os consultores";
    }

    @GetMapping("/listarId")
    public String listarConsultorPorId () {
        return "Mostrando Consultor por ID";
    }

    @PutMapping("/alterar")
    public String alterarConsultorPorId () {
        return "Alterar Consultor por Id";
    }

    @DeleteMapping("/deletar")
    public String deletarConsulorPorId () {
        return "Excluindo consultor por id";
    }

}
