package com.projetobackend.Projetobackend.repository;

import com.projetobackend.Projetobackend.model.entities.Produto;
import com.projetobackend.Projetobackend.model.exception.ResourceNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepostory {

    //Simulando um banco de dados
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * Metodo para retornar uma lista de produtos
     *
     * @return Lista de produtos.
     */
    public List<Produto> obterTodos(){
        return produtos;
    }

    /**
     * Metodo para retornar uma lista de produtos pelo seu id.
     * @param id do produto que será localizado.
     * @return retorno um produto caso tenha encontrado
     */
    public Optional<Produto> obterPorId(Integer id){
        return produtos
                .stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();
    }

    /**
     * Metodo para adicionar produto na lista.
     * @param produto que será adicionando.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto){
        ultimoId++;
        produto.setId((ultimoId));
        produtos.add(produto);
        return produto;
    }

    /**
     * Método para deletar o produto por id.
     * @param id do produto que vai ser deletado.
     */
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Método para atualizar o produto na lista
     * @param produto que será atualizado
     * @return Retorna o produto apos atualizar a lista.
     */
    public Produto atualizar(Produto produto){
       Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

       if (produtoEncontrado.isEmpty()){
           throw new ResourceNotFoundException("Produto não encontrado");
       }
       deletar(produto.getId());
       produtos.add(produto);
       return produto;

    }
}
