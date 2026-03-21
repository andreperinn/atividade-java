package com.ap.demo.repositories;

import com.ap.demo.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository <AutorModel, Long> {
}
