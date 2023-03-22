
import fatec.poo.model.Circulo;
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

    
    public static void main(String[] args) {
        
        double raio;
        Circulo objCirc = new Circulo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        objCirc.setRaio(raio);
        System.out.println("Medida da Area: "+ objCirc.calcArea());
        System.out.println("Medida do Perimetro: "+ objCirc.calcPerimetro());
        System.out.println("Medida do Diametro: " + objCirc.calcDiametro());
        
        
        
        
    }
    
}
