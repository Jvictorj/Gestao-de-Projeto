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
    public ConsultorDTO criarConsultor (@RequestBody ConsultorDTO consultor) {
        return consultorService.criarConsultor(consultor);
    }

    @GetMapping("/listar")
    public List<ConsultorDTO> listarConsultores () {
        return consultorService.listarConsultor();
    }

    @GetMapping("/listar/{id}")
    public ConsultorDTO listarConsultorPorId (@PathVariable Long id) {
        return consultorService.listarConsultorPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public ConsultorDTO alterarConsultorPorId (@PathVariable Long id, @RequestBody ConsultorDTO atualizarConsultor) {
        return consultorService.atualizarConsultor(id, atualizarConsultor);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarConsulorPorId (@PathVariable Long id) {
        consultorService.deletarConsultorPorId(id);
    }

}
