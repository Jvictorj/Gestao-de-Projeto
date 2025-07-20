package dev.java10x.GestaoDeProjetos.Projetos;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProjetoService {

    private ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public List<ProjetosModel> listarProjeto() {
        return projetoRepository.findAll();
    }

    public ProjetosModel listarProjetoPorId(Long id) {
        Optional<ProjetosModel> projetoPorId = projetoRepository.findById(id);
        return projetoPorId.orElse(null);
    }
}
