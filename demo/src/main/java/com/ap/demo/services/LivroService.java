package com.ap.demo.services;

import com.ap.demo.models.LivroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ap.demo.repositories.LivroRepository;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel){
        return livroRepository.save(livroModel);
    }

    public List <LivroModel> findAll(){
        return livroRepository.findAll();
    }

    public LivroModel atualizar(Long id, LivroModel livroModel){
        LivroModel model = livroRepository.findById(id).get();
        model.setTitulo(livroModel.getTitulo());
        return livroRepository.save(model);
    }

    public void deletar(Long id){
        livroRepository.deleteById(id);
    }

    public void buscarId(Long id){
        livroRepository.findById(id);
    }


}
