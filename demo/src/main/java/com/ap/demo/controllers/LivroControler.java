package com.ap.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import com.ap.demo.models.LivroModel;
import com.ap.demo.services.LivroService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path="/livros")
public class LivroControler {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<LivroModel> criarLivro(@RequestBody LivroModel livroModel) {
        LivroModel request = livroService.criarLivro(livroModel);
        URI uri =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<LivroModel>> listarLivros() {
        List<LivroModel> request = livroService.listarLivros();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<LivroModel> buscarLivroPorId(@PathVariable Long id) {
        LivroModel request = livroService.buscarLivroPorId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletarLivroPorId(@PathVariable Long id) {
        livroService.deletarLivroPorId(id);
        return ResponseEntity.noContent().build();
    }

}