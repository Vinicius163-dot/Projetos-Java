package org.example.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ContaBancaria {
    @ManyToOne
    private Cliente titular;
    private double saldo;
    private String agencia;
    @Id
    private String numeroConta;
    private double fatura;
    private static long contadorContas = 0;


    public ContaBancaria (Cliente titular, double saldo, double fatura){
        contadorContas++;
        this.titular = titular;
        this.saldo = saldo;
        this.fatura = fatura;
        this.agencia = "0001";
        this.numeroConta = contadorContas + "";
    }

    public ContaBancaria(){}

    public void depositar(double valor){
        if (valor > 0){
            saldo = valor + saldo;
        } else {
            System.out.println("Valor inválido para depósito, o valor precisa ser maior que 0.");
        }

    }

    public void sacar (double valor){
        if (valor > 0 && valor <= saldo){
            saldo = saldo - valor;
        } else {
            System.out.println("Saque não realizado, saldo insuficiente.");
        }
    }

    public void pagarFatura (double valorFatura){
        if (fatura > 0 && saldo > 0 && saldo >= valorFatura){
            saldo = saldo - valorFatura;
            fatura = fatura - valorFatura;
        } else {
        System.out.println("Fatura não debitada, saldo insuficiente para pagamento da fatura atual");
        }
    }
    

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getFatura() {
        return fatura;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}

