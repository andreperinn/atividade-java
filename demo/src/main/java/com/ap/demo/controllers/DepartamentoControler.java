package com.ap.demo.controllers;

import com.ap.demo.models.DepartamentoModel;
import com.ap.demo.models.LivroModel;
import com.ap.demo.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping (path = "/departamento")
public class DepartamentoControler {

    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<DepartamentoModel> criarDepartamento(@RequestBody DepartamentoModel departamentoModel) {
        DepartamentoModel request = departamentoService.criarDepartamento(departamentoModel);
        URI uri =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<DepartamentoModel>> listarDepartamento() {
        List<DepartamentoModel> request = departamentoService.listarDepartamento();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<DepartamentoModel> buscarId(@PathVariable Long id) {
        DepartamentoModel request = departamentoService.buscarId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletarId(@PathVariable Long id) {
        departamentoService.deletarId(id);
        return ResponseEntity.noContent().build();
    }
}
