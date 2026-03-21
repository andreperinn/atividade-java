package com.ap.demo.services;

import com.ap.demo.models.ProdutoModel;
import com.ap.demo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public ProdutoModel criarProduto (ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public List <ProdutoModel> findAll (){
        return produtoRepository.findAll();
    }

    public ProdutoModel buscarId (Long id){
       return produtoRepository.findById(id).get();

    }

    public void deletar (Long id){
        produtoRepository.deleteById(id);
    }
}
