package com.projetobackend.Projetobackend.services;


import com.projetobackend.Projetobackend.repository.ClienteRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepostory clienteRepostory;

    
}
