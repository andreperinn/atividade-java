package com.ap.demo.controllers;

import com.ap.demo.models.ClienteModel;
import com.ap.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping (path = "/clientes")
public class ClientesControler {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity <ClienteModel> criarCliente (@RequestBody ClienteModel clienteModel){
        ClienteModel request = clienteService.criarCliente(clienteModel);
        URI uri =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity <List<ClienteModel>> listarclientes(){
        List<ClienteModel> request = clienteService.listarCliente();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<ClienteModel> buscarId(@PathVariable Long id){
        ClienteModel request = clienteService.buscarId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletarId(@PathVariable Long id){
        clienteService.deletarId(id);
        return ResponseEntity.noContent().build();
    }

}
