package com.ap.demo.repositories;

import com.ap.demo.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository <FornecedorModel, Long> {
}
