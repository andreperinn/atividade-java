package com.ap.demo.controllers;

import com.ap.demo.models.FornecedorModel;
import com.ap.demo.models.LivroModel;
import com.ap.demo.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/fornecedor")
public class FornecedorControler {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<FornecedorModel> criarFornecdor(@RequestBody FornecedorModel fornecedorModel) {
        FornecedorModel request = fornecedorService.criarFornecedor(fornecedorModel);
        URI uri =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<FornecedorModel>> listarFornecedor() {
        List<FornecedorModel> request = fornecedorService.listarFornecedor();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<FornecedorModel> buscarId(@PathVariable Long id) {
        FornecedorModel request = fornecedorService.buscarId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletarId(@PathVariable Long id) {
        fornecedorService.deletarId(id);
        return ResponseEntity.noContent().build();
    }

}
