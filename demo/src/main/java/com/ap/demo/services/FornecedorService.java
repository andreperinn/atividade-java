package com.ap.demo.services;

import com.ap.demo.models.FornecedorModel;
import com.ap.demo.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public FornecedorModel criarFornecedor (FornecedorModel fornecedorModel){
        return fornecedorRepository.save(fornecedorModel);
    }

    public List <FornecedorModel> listarFornecedor(){
        return fornecedorRepository.findAll();
    }

    public FornecedorModel buscarId (Long id){
        return fornecedorRepository.findById(id).get();
    }

    public void deletarId(Long id){
        fornecedorRepository.deleteById(id);
    }

}
