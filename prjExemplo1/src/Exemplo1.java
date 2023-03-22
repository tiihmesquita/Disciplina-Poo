import java.util.Scanner;
/**
 *
 * @author Thiago Mesquita
 */
public class Exemplo1 {

    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);
        
        
        int codProd,qtdVendida;
        String descProd;
        double precUnit, valPagar;
        
        System.out.println("Digite código do produto: ");
        codProd = teclado.nextInt();
        System.out.println("Digite a descrição: ");
        descProd = teclado.next();
        System.out.println("Digite o preço unitário: ");
        precUnit = teclado.nextDouble();
        System.out.println("Digite a qtde. vendida: ");
        qtdVendida = teclado.nextInt();
        valPagar = precUnit * qtdVendida;
        System.out.println("\nValor da compra R$ =>" + valPagar);
        */
        Caneta faber = new Caneta(4,"Azul");
        faber.escrever();
    }
    
}
