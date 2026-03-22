package com.ap.demo.services;

import com.ap.demo.models.CategoriaModel;
import com.ap.demo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public CategoriaModel criarCategoria (CategoriaModel  categoriaModel){
        return categoriaRepository.save(categoriaModel);
    }

    public List <CategoriaModel> listarCategorias(){
        return categoriaRepository.findAll();
    }

    public CategoriaModel buscarId(Long id){
        return categoriaRepository.findById(id).get();
    }

    public void deletaId(Long id){
        categoriaRepository.deleteById(id);
    }
}
