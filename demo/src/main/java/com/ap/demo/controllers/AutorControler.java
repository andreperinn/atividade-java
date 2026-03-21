package com.ap.demo.controllers;

import com.ap.demo.models.AutorModel;
import com.ap.demo.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/autores")
public class AutorControler {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity <AutorModel> criarAutor(@RequestBody AutorModel autorModel){
        AutorModel request = autorService.criarAutor(autorModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity <List<AutorModel>> listarAutores (){
        List <AutorModel> request = autorService.listarAutores();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity <AutorModel>  buscarId  (@PathVariable Long id){
        AutorModel request = autorService.buscarId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity <Void> deletarId(@PathVariable Long id){
        autorService.deletarId(id);
        return ResponseEntity.noContent().build();
    }
}
