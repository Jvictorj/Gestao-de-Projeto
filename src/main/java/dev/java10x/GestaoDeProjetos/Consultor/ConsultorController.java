package dev.java10x.GestaoDeProjetos.Consultor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultor")

public class ConsultorController {

    @PostMapping("/criar")
    public String criarConsultor () {
        return "Cadastre um Consultor";
    }

    @GetMapping("/todos")
    public String mostrarTodosOsConsultores () {
        return "Mostrando todos os consultores";
    }

    @GetMapping("/porId")
    public String mostrarConsultorPorId () {
        return "Mostrando Consultor por ID";
    }

    @PutMapping("/alterar")
    public String alterarConsultorPorId () {
        return "Alterar Consultor por Id";
    }

    @DeleteMapping("/excluir")
    public String excluirConsulorPorId () {
        return "Excluindo consultor por id";
    }

}
