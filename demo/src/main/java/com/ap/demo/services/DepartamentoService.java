package com.ap.demo.services;

import com.ap.demo.models.DepartamentoModel;
import com.ap.demo.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public DepartamentoModel criarDepartamento(DepartamentoModel departamentoModel){
        return departamentoRepository.save(departamentoModel);
    }

    public List<DepartamentoModel> listarDepartamento () {
        return departamentoRepository.findAll();
    }

    public DepartamentoModel buscarId(Long id){
        return departamentoRepository.findById(id).get();
    }

    public void deletarId(Long id){
        departamentoRepository.deleteById(id);
    }
}
