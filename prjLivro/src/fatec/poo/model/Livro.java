
package fatec.poo.model;

/**
 *
 * @author Thiago Mesquita
 */
public class Livro {
    private int identificacao;
    private boolean situacao;
    private double valMultaDiaria;

    public Livro(int identificacao) {
        this.identificacao = identificacao;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }
    public void emprestar(){
        this.situacao = true;
    }
    
    public double devolver(int dias){
        this.situacao = false;
        return dias*this.valMultaDiaria;
    }
    
    
    
}
