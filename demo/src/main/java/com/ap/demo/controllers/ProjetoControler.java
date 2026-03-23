package com.ap.demo.controllers;

import com.ap.demo.models.LivroModel;
import com.ap.demo.models.ProjetoModel;
import com.ap.demo.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping (path = "/projetos")
public class ProjetoControler {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<ProjetoModel> criarProjeto(@RequestBody ProjetoModel projetoModel) {
        ProjetoModel request = projetoService.criarProjeto(projetoModel);
        URI uri =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<ProjetoModel>> listarProjeto() {
        List<ProjetoModel> request = projetoService.listarProjeto();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<ProjetoModel> buscarId(@PathVariable Long id) {
        ProjetoModel request = projetoService.buscarId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletarId(@PathVariable Long id) {
        projetoService.deletarId(id);
        return ResponseEntity.noContent().build();
    }
}
