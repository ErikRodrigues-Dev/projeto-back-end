package com.projetobackend.Projetobackend.services;

import com.projetobackend.Projetobackend.model.entities.Produto;
import com.projetobackend.Projetobackend.repository.ProdutoRepostory_old;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepostory_old produtoRepostory;

    /**
     * Método para retornar uma lista de produtos
     * @return Lista de produtos.
     */
    public List<Produto> obterTodos(){
        return produtoRepostory.obterTodos();
    }

    /**
     * Metodo para retornar uma lista de produtos pelo seu id.
     * @param id do produto que será localizado.
     * @return retorno um produto caso tenha encontrado
     */
    public Optional<Produto> obterPorId(Integer id){
        return produtoRepostory.obterPorId(id);
    }

    /**
     * Metodo para adicionar produto na lista.
     * @param produto que será adicionando.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto){
        return produtoRepostory.adicionar(produto);
    }

    /**
     * Método para deletar o produto por id.
     * @param id do produto que vai ser deletado.
     */
    public void deletar(Integer id){
       produtoRepostory.deletar(id);
    }

    /**
     * Método para atualizar o produto na lista
     * @param produto que será atualizado
     * @return Retorna o produto apos atualizar a lista.
     */
    public Produto atualizar(Integer id, Produto produto){
        produto.setId(id);
        return produtoRepostory.atualizar(produto);
    }
}
