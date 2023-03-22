
package fatec.poo.model;

/**
 *
 * @author Thiago Mesquita
 */
public class ContaCorrente {
    private int numero;
    private double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void sacar(double valor){
        if(valor<= this.saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double valor){
        saldo += valor;
    }
    
}
