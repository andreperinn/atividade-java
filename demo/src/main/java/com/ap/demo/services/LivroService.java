package com.ap.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ap.demo.models.LivroModel;
import com.ap.demo.repositories.LivroRepository;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel) {
        return livroRepository.save(livroModel);
    }

    public List<LivroModel> listarLivros() {
        return livroRepository.findAll();
    }

    public LivroModel buscarLivroPorId(Long id) {
        return livroRepository.findById(id).get();
    }

    public void deletarLivroPorId(Long id) {
        livroRepository.deleteById(id);
    }

}