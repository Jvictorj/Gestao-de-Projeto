package dev.java10x.GestaoDeProjetos.Consultor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultor")

public class ConsultorController {

    private ConsultorService consultorService;

    public ConsultorController(ConsultorService consultorService) {
        this.consultorService = consultorService;
    }

    @PostMapping("/criar")
    public String criarConsultor () {
        return "Cadastre um Consultor";
    }

    @GetMapping("/listar")
    public List<ConsultorModel> listarConsultores () {
        return consultorService.listarConsultor();
    }

    @GetMapping("/listar/{id}")
    public ConsultorModel listarConsultorPorId (@PathVariable Long id) {
        return consultorService.listarConsultorPorId(id);
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
