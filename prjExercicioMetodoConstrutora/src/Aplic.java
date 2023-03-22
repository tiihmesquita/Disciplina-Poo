
import fatec.poo.model.Circulo;
import static java.time.Clock.system;
import java.util.*;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String unidade;
        double raio;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a unidade: ");
        unidade = entrada.next();
        
        Circulo objCirc = new Circulo(unidade);
        
        
        System.out.println("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        objCirc.setRaio(raio);
        
        System.out.println("Medida da Area: "+ objCirc.calcArea()+ " "+ objCirc.getUnidadeMedida()+ "²");
        System.out.println("Medida do Perimetro: "+ objCirc.calcPerimetro()+ " "+ objCirc.getUnidadeMedida()+ "²");
        System.out.println("Medida do Diametro: " + objCirc.calcDiametro()+ " "+ objCirc.getUnidadeMedida()+ "²");
        
        
        
        
    }
    
}
