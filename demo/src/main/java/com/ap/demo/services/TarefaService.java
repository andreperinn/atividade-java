package com.ap.demo.services;

import com.ap.demo.models.LivroModel;
import com.ap.demo.models.TarefaModel;
import com.ap.demo.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public TarefaModel criarTarefa(TarefaModel tarefaModel) {
        return tarefaRepository.save(tarefaModel);
    }

    public List<TarefaModel> listartarefa() {
        return tarefaRepository.findAll();
    }

    public TarefaModel buscarId(Long id) {
        return tarefaRepository.findById(id).get();
    }

    public void deletarId(Long id) {
        tarefaRepository.deleteById(id);
    }
}
