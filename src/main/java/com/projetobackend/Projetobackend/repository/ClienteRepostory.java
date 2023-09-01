package com.projetobackend.Projetobackend.repository;

import com.projetobackend.Projetobackend.model.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepostory  extends JpaRepository<Cliente, Integer> {
}
