package fatec.poo.model;

/**
 *
 * @author Thiago Mesquita
 */
public class Retangulo {
    private double altura;
    private double base;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    public double calcArea(){
        return altura*base;
    }
    public double calcPerimetro(){
        return 2*(altura+base);
    }
    public double calcDiagonal(){
        double hipotenusa = Math.sqrt(Math.pow(this.altura,2)+ Math.pow(this.base,2));
        
        return hipotenusa;
    }
}
