package com.ap.demo.services;

import com.ap.demo.models.AutorModel;
import com.ap.demo.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository   autorRepository;

    public AutorModel criarAutor (AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> listarAutores (){
        return autorRepository.findAll();
    }

    public AutorModel buscarId (Long id){
        return autorRepository.findById(id).get();
    }

    public void deletarId(Long id){
        autorRepository.deleteById(id);
    }


}
