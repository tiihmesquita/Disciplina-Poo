
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Thiago Mesquita
 */
public class Aplic {

   
    public static void main(String[] args) {
        double raio;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        Circulo[] matCirc = new Circulo[10];
        
        for(int i = 0; i < 10; i++){
            
        matCirc[i] = new Circulo();
        
        System.out.println("Digite o raio do circulo: ");
        
        raio = entrada.nextDouble();
        matCirc[i].setRaio(raio);
        
        }
        for(int i = 0; i < 10; i++){
        System.out.println("Circulo - " + i +1);
        System.out.println("Medida da Area: "+ df.format(matCirc[i].calcArea()));
        System.out.println("Medida do Perimetro: "+ df.format(matCirc[i].calcPerimetro()));
        System.out.println("Medida do Diametro: " + df.format(matCirc[i].calcDiametro()));
        }
        
        
        
    }
    
}
