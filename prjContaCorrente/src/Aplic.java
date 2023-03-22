
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Mesquita
 */
public class Aplic {
    public static void main (String args[]){
        int escolha =0, numero;
        double valor, saldo;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero da conta:");
        numero = entrada.nextInt();
        System.out.println("Saldo: ");
        valor = entrada.nextDouble();
        
        ContaCorrente objConta = new ContaCorrente(numero, valor);
        
        do{
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Consultar Saldo");
            System.out.println("4- Sair");
            escolha = entrada.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("Conta: "+objConta.getNumero());
                    System.out.println("Valor a depositar: ");
                    objConta.depositar(entrada.nextDouble());
                    break;
                case 2:
                    System.out.println("Conta: "+objConta.getNumero());
                    System.out.println("Valor a sacar: ");
                    valor = entrada.nextDouble();
                    if(objConta.getSaldo()<=valor){
                        objConta.sacar(valor);
                    }
                    else{
                        System.out.println("Saldo insuficiente");
                    }
                    
                    break;
                case 3:
                    System.out.println("Saldo: " + df.format(objConta.getSaldo()) );
                    break;    
            }
            System.out.println("\n");
            
        }while(escolha <4);
        
    }
}
