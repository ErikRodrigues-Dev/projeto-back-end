package com.projetobackend.Projetobackend.repository;

import com.projetobackend.Projetobackend.model.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}
