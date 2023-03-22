/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Mesquita
 */
public class Caneta {
  
    private int tamanho;
    private String cor;

    public Caneta(int tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }
    public Caneta() {
       
    }
    
    
    
    
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
    public static void escrever(){
        System.out.println("Escrevendo ...");
    }
}
