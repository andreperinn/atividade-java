package com.ap.demo.repositories;

import com.ap.demo.models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository <ProjetoModel, Long> {
}
