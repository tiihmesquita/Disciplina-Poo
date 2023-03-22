
import java.util.Scanner;


/**
 *
 * @author Thiago Mesquita
 */
public class Radar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        if(velocidade > 80){
            multas ++;
        }
        if(multas == 3){
            System.out.println("3 multas. Levou pontos na carteira");
        }
        else{
            System.out.println(multas+" multas. Não levou pontos na carteira");
        }
    }
    
}
