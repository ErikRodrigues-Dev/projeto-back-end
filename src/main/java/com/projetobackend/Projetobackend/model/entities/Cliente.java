package com.projetobackend.Projetobackend.model.entities;

public class Cliente {

     /*- Produto : CodCliente, nome, CPF, idade, celular, email*/

    private Integer CodCliente;
    private String nome;
    private String cpf;
    private Integer idade;
    private String email;

    public Integer getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(Integer codCliente) {
        CodCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
