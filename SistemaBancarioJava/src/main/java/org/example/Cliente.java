package org.example;

public class Cliente {
    private String nome;
    private String cpf;
    private char tipo;
    private String rg;
    private int idade;

public Cliente(String nome, String cpf, char tipo, String rg, int idade){
    this.nome = nome;
    this.cpf = cpf;
    this.tipo = tipo;
    this.rg = rg;
    this.idade = idade;
}

public void setNome(String nome){
    this.nome = nome;
}
public void setCpf(String cpf){
        this.cpf = cpf;
}

public void setIdade(int idade) {
        this.idade = idade;
}

public void setRg(String rg) {
        this.rg = rg;
}

public void setTipo(char tipo) {
        this.tipo = tipo;
}

    public char getTipo() {
        return tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}

