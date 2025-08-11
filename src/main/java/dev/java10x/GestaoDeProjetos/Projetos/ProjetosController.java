package dev.java10x.GestaoDeProjetos.Projetos;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")

public class ProjetosController {

    private ProjetoService projetoService;

    public ProjetosController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @PostMapping("/criar")
    public ProjetoDTO criarProjeto(ProjetoDTO projeto) {
        return projetoService.criarProjeto(projeto);
    }

    @GetMapping ("/listar")
    public List<ProjetoDTO> listarProjetos() {
        return projetoService.listarProjeto();
    }

    @GetMapping ("/listar/{id}")
    public ProjetoDTO listarProjetosPorId(@PathVariable Long id) {
        return projetoService.listarProjetoPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public ProjetoDTO alterarProjetoPorId(@PathVariable Long id, @RequestBody ProjetoDTO atualizarProjeto) {
        return projetoService.atualizarProjeto(id, atualizarProjeto);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarProjetoPorId(@PathVariable Long id) {
        projetoService.deletarProjetoPorId(id);
    }

}
