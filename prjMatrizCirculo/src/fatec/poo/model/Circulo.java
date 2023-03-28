/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Thiago Mesquita
 */
public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double calcArea(){
        
        return 3.1416 * Math.pow(this.raio,2);
    }
    public double calcPerimetro(){
        return (2*3.1416)*this.raio;
    }
    public double calcDiametro(){
        return 2*this.raio;
    }
}
