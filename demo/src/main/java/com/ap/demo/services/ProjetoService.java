package com.ap.demo.services;

import com.ap.demo.models.LivroModel;
import com.ap.demo.models.ProdutoModel;
import com.ap.demo.models.ProjetoModel;
import com.ap.demo.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    public ProjetoModel criarProjeto(ProjetoModel projetoModel) {
        return projetoRepository.save(projetoModel);
    }

    public List<ProjetoModel> listarProjeto() {
        return projetoRepository.findAll();
    }

    public ProjetoModel buscarId(Long id) {
        return projetoRepository.findById(id).get();
    }

    public void deletarId(Long id) {
        projetoRepository.deleteById(id);
    }
}
