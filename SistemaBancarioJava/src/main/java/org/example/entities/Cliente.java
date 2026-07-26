package org.example.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    private String nome;
    @Id
    private String cpf;
    private String tipo;
    private String rg;
    private int idade;

public Cliente(String nome, String cpf, String tipo, String rg, int idade){
    this.nome = nome;
    this.cpf = cpf;
    this.tipo = tipo;
    this.rg = rg;
    this.idade = idade;
}

public Cliente(){}

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

public void setTipo(String tipo) {
        this.tipo = tipo;
}

    public String getTipo() {
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

