package com.web.farmacia.repository;
import java.util.List;

import com.web.farmacia.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository < Categoria, Long>{
    public List <Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
