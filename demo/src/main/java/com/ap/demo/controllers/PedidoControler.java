package com.ap.demo.controllers;


import com.ap.demo.models.LivroModel;
import com.ap.demo.models.PedidoModel;
import com.ap.demo.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tools.jackson.databind.annotation.JsonAppend;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoControler {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoModel> criarPedido(@RequestBody PedidoModel pedidoModel){
        PedidoModel request = pedidoService.criarPedido(pedidoModel);
        URI uri =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping

    public ResponseEntity<List<PedidoModel>> listarPedidos() {
        List<PedidoModel> request = pedidoService.listarPedidos();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<PedidoModel> buscarId (@PathVariable Long id) {
        PedidoModel request = pedidoService.buscarId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletarId(@PathVariable Long id) {
        pedidoService.deletarId(id);
        return ResponseEntity.noContent().build();
    }





}
