package com.ap.demo.repositories;

import com.ap.demo.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long> {
}
