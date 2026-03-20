package com.ap.demo.controllers;

import com.ap.demo.models.LivroModel;
import com.ap.demo.models.ProdutoModel;
import com.ap.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoControler {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoModel criarProduto (@RequestBody ProdutoModel produtoModel){
        return produtoService.criarProduto(produtoModel);
    }

    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public void buscarId (@PathVariable Long id){
        produtoService.buscarId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        produtoService.deletar(id);
    }




}
