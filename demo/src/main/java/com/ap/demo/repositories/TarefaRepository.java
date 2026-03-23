package com.ap.demo.repositories;

import com.ap.demo.models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository <TarefaModel, Long> {
}
