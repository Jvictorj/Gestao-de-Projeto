package dev.java10x.GestaoDeProjetos.Consultor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class ConsultorController {

    @GetMapping("/consultor")
    public String EscolherConsultor() {
        return "Escolha um Consultor";
    }

    @GetMapping("/consultor/escolhido")
    public String ConsultorEscolhido() {
        return "Você escolheu o João como consultor";
    }
}
