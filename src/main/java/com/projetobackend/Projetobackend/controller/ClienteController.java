package com.projetobackend.Projetobackend.controller;

import com.projetobackend.Projetobackend.model.entities.Cliente;
import com.projetobackend.Projetobackend.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    public ClienteService clienteService;

    @GetMapping
    public List<Cliente> ObterTodos(){
        return clienteService.obterTodos();
    }

    @PostMapping
    public Cliente Adicionar(@RequestBody Cliente cliente){
        return clienteService.adicionar(cliente);
    }

    @GetMapping("/{id}")
    public Optional ObterPorId(@PathVariable Integer id){
        return clienteService.obterPorId(id);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id){
        clienteService.deletar(id);
        return "Produto com id: "+id+" Foi deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@RequestBody Cliente cliente, @PathVariable Integer id){
        return clienteService.atualizar(id, cliente);
    }

}
