package com.ap.demo.repositories;

import com.ap.demo.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long> {
}
