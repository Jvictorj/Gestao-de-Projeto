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

    public List<ProjetosModel> listarProjeto () {
        return projetoRepository.findAll();
    }

    public ProjetosModel listarProjetoPorId (Long id) {
        Optional<ProjetosModel> projetoPorId = projetoRepository.findById(id);
        return projetoPorId.orElse(null);
    }

    public ProjetosModel criarProjeto (ProjetosModel projeto) {
        return projetoRepository.save(projeto);
    }

    public ProjetosModel atualizarProjeto (Long id, ProjetosModel atualizarProjeto) {
        if (projetoRepository.existsById(id))
            atualizarProjeto.setId(id);
        projetoRepository.save(atualizarProjeto);
    }

    public void deletarProjetoPorId (Long id) {
        projetoRepository.deleteById(id);
    }

  
}
