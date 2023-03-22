
import java.util.Scanner;


/**
 *
 * @author Thiago Mesquita
 */
public class DesafioDio {

    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        String concatena ="";
        
       int atribuir = arquivoDoPc.length()-3;
        int validacao = 0;
        
        for(int i = atribuir;validacao!=3;i++){
            validacao++;
            char teste = arquivoDoPc.charAt(i);
            concatena += teste;
        }
        System.out.println(concatena);
        if(concatena.equals("mp3")){
            System.out.println("Salvar");
        }
        else{
            System.out.println("Deletar");
        }
    }
    
}
