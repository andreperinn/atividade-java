package com.ap.demo.controllers;


import com.ap.demo.models.LivroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ap.demo.services.LivroService;

import java.util.List;

@RestController
@RequestMapping(path = "/livros")
public class LivroControler {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroModel> findAll(){
        return livroService.findAll();
    }

    @PostMapping
    public LivroModel criarLivro (@RequestBody LivroModel livroModel){
        return livroService.criarLivro(livroModel);
    }

    @PutMapping("/{id}")
    public  LivroModel atualizar (@PathVariable Long id, @RequestBody LivroModel livroModel){
        return livroService.atualizar(id,livroModel);
    }

    @DeleteMapping
    public void deletar (@PathVariable Long id){
        livroService.deletar(id);
    }

}
