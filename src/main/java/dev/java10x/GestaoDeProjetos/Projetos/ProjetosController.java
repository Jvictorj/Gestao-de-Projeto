package dev.java10x.GestaoDeProjetos.Projetos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class ProjetosController {

    @GetMapping ("/projeto")
    public String EscolherProjeto() {
        return "Escolha um projeto";
    }


}
