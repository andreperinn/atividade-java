package com.ap.demo.controllers;

import com.ap.demo.models.LivroModel;
import com.ap.demo.models.TarefaModel;
import com.ap.demo.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping (path = "/tarefa")
public class TarefaControler {

    @Autowired
    private TarefaService tarefaService;


    @PostMapping
    public ResponseEntity<TarefaModel> criarTarefa(@RequestBody TarefaModel tarefaModel) {
        TarefaModel request = tarefaService.criarTarefa(tarefaModel);
        URI uri =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<TarefaModel>> listarTarefa() {
        List<TarefaModel> request = tarefaService.listartarefa();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<TarefaModel> buscarId(@PathVariable Long id) {
        TarefaModel request = tarefaService.buscarId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletarId(@PathVariable Long id) {
        tarefaService.deletarId(id);
        return ResponseEntity.noContent().build();
    }
}
