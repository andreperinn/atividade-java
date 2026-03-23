package com.ap.demo.repositories;

import com.ap.demo.models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository <DepartamentoModel, Long> {
}
