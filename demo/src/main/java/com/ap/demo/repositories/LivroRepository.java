package com.ap.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ap.demo.models.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {
}