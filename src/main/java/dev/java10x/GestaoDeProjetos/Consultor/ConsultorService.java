package dev.java10x.GestaoDeProjetos.Consultor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public ConsultorModel listarConsultorPorId(Long id) {
        Optional<ConsultorModel> consultorPorId = consultorRepository.findById(id);
        return consultorPorId.orElse(null);
    }

    public ConsultorModel criarConsultor(ConsultorModel consultor) {
        return consultorRepository.save(consultor);
    }

    public void deletarConsultorPorId(Long id) {
        consultorRepository.deleteById(id);
    }

    public  ConsultorModel atualizarConsultor (Long id, ConsultorModel atualizarConsultor) {
        if (consultorRepository.existsById(id))
            atualizarConsultor.setId(id);
            consultorRepository.save(atualizarConsultor);
        return null;
    }
}
