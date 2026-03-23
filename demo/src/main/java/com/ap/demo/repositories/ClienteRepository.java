package com.ap.demo.repositories;

import com.ap.demo.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <ClienteModel, Long> {
}
