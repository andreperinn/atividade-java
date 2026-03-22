package com.ap.demo.controllers;

import com.ap.demo.models.CategoriaModel;
import com.ap.demo.repositories.CategoriaRepository;
import com.ap.demo.services.CategoriaService;
import jakarta.servlet.Servlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/categorias")
public class CategoriaControler {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity <CategoriaModel> criarCategoria(@RequestBody CategoriaModel categoriaModel){
        CategoriaModel request = categoriaService.criarCategoria(categoriaModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaModel>>listarcategoria (){
        List<CategoriaModel> request = categoriaService.listarCategorias();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path = "/{id}")
    public  ResponseEntity <CategoriaModel> buscarId(@PathVariable Long id){
        CategoriaModel request = categoriaService.buscarId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping (path = "/{id}")
    public ResponseEntity<Void> deletarId(@PathVariable Long id){
        categoriaService.deletaId(id);
        return ResponseEntity.noContent().build();
    }

}
