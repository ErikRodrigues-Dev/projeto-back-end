package com.projetobackend.Projetobackend.repository;

import com.projetobackend.Projetobackend.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepostory {

     /* Metodos: obterTodos, obtePorId, adicionar, atualizar, deletar */

    private List<Cliente> clientes = new ArrayList<Cliente>();
    private Integer ultimoId = 0;

    public List<Cliente> obterTodos(){
        return clientes;
    }

    public Optional<Cliente> obterPorId(Integer id){
        return clientes
                .stream()
                .filter(cliente -> cliente.getCodCliente() == id)
                .findFirst();
    }

    public Cliente adicionar(Cliente cliente){
        ultimoId++;
        cliente.setCodCliente(ultimoId);
        clientes.add(cliente);
        return cliente;
    }

    public void deletar(Integer id){
        clientes.removeIf(cliente -> cliente.getCodCliente() == id);
    }

    public Cliente atualizar(Cliente cliente){
        Optional<Cliente> clienteEncontrado = obterPorId(cliente.getCodCliente());
        if (clienteEncontrado.isEmpty()){
            throw new InputMismatchException("Cliente não encontrado!");
        }
        deletar(cliente.getCodCliente());
        clientes.add(cliente);
        return cliente;
    }


}
