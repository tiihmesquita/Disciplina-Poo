
import fatec.poo.model.Retangulo;
import java.util.Scanner;


/**
 *
 * @author Thiago Mesquita
 */
public class Aplic {

    public static void main(String[] args) {
        double medAlt, medBase;
        
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        medAlt = entrada.nextDouble();
        medBase = entrada.nextDouble();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        System.out.println("Medida da area: "+objRet.calcArea());
        System.out.println("Medida do perimetro: "+objRet.calcPerimetro());
        System.out.println("Medida da diagonal: " +objRet.calcDiagonal());
    }
    
}
