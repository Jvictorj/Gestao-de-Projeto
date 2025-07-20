package dev.java10x.GestaoDeProjetos.Consultor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ConsultorService {

    //Injeção de dependencia para dar ao service acesso ao repository
    private ConsultorRepository consultorRepository;

    public ConsultorService(ConsultorRepository consultorRepository) {
        this.consultorRepository = consultorRepository;
    }

    public List<ConsultorModel> listarConsultor() {
        return consultorRepository.findAll();
    }

}
