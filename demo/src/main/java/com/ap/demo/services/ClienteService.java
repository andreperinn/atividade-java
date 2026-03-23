package com.ap.demo.services;

import com.ap.demo.models.ClienteModel;
import com.ap.demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteModel criarCliente (ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

    public List <ClienteModel> listarCliente(){
        return clienteRepository.findAll();
    }

    public ClienteModel buscarId(Long id){
        return clienteRepository.findById(id).get();
    }

    public void deletarId(Long id){
        clienteRepository.deleteById(id);
    }

}
