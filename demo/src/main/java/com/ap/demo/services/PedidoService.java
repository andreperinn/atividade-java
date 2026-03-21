package com.ap.demo.services;

import com.ap.demo.models.PedidoModel;
import com.ap.demo.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;


    public PedidoModel criarPedido (PedidoModel pedidoModel){
        return pedidoRepository.save(pedidoModel);
    }

    public List <PedidoModel> listarPedidos(){
        return pedidoRepository.findAll();
    }

    public PedidoModel buscarId (Long id){
        return pedidoRepository.findById(id).get();
    }

    public void deletarId (Long id){
        pedidoRepository.deleteById(id);
    }





}
