package org.example;
import java.util.Scanner;
import org.example.entities.Cliente;
import org.example.entities.ContaBancaria;

public class Main{
    public static void main(String[] args){
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
        String nomeDigitado = leitura.nextLine();
        System.out.println("Digite o seu CPF: ");
        String cpfDigitado = leitura.nextLine();
        System.out.println("Seu cadastro é para PF ou PJ?: ");
        String tipoDigitado = leitura.nextLine();
        System.out.println("Digite o seu RG: ");
        String rgDigitado = leitura.nextLine();
        System.out.println("E por último, digite a sua idade: ");
        int idadeDigitado = leitura.nextInt();


        Cliente novoCliente = new Cliente (nomeDigitado, cpfDigitado, tipoDigitado, rgDigitado, idadeDigitado);
        ContaBancaria novaConta = new ContaBancaria (novoCliente , 0.0 , 0.0);




    }
}