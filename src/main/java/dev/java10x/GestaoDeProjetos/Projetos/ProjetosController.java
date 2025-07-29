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
    public ProjetosModel criarProjeto(ProjetosModel projeto) {
        return projetoService.criarProjeto(projeto);
    }

    @GetMapping ("/listar")
    public List<ProjetosModel> listarProjetos() {
        return projetoService.listarProjeto();
    }

    @GetMapping ("/listar/{id}")
    public ProjetosModel listarProjetosPorId(@PathVariable Long id) {
        return projetoService.listarProjetoPorId(id);
    }

//    @PutMapping("/alterar/{id}")
//    public ProjetosModel alterarProjetoPorId(@PathVariable Long id) {
//        return ;
//    }

    @DeleteMapping("/deletar/{id}")
    public void deletarProjetoPorId(@PathVariable Long id) {
        projetoService.deletarProjetoPorId(id);
    }

}
