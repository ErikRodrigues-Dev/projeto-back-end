package com.projetobackend.Projetobackend.services;


import com.projetobackend.Projetobackend.model.entities.Cliente;
import com.projetobackend.Projetobackend.repository.ClienteRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepostory clienteRepostory;

    public List<Cliente>obterTodos(){return clienteRepostory.obterTodos();}

    public Optional<Cliente>obterPorId(Integer id){return clienteRepostory.obterPorId(id);}

    public Cliente adicionar (Cliente cliente){ return clienteRepostory.adicionar(cliente);}

    public void deletar(Integer id){clienteRepostory.deletar(id);}

    public Cliente atualizar(Integer id, Cliente cliente){
        cliente.setCodCliente(id);
        return clienteRepostory.atualizar(cliente);
    }


}
