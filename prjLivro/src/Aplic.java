
import fatec.poo.model.Livro;
import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author Thiago Mesquita
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int escolha = 0,diasAtraso ;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a identificação do livro: ");
        
        Livro objLivro = new Livro(entrada.nextInt());
        
        System.out.println("Digite o valor da multa:");
        
        try{
        objLivro.setValMultaDiaria(entrada.nextDouble());
        }catch(InputMismatchException e){
            e.toString();
            System.out.println("Digite com virgula");
        }

        do{
            System.out.println("1 –Consultar livro");
            System.out.println("2 –Emprestar livro");
            System.out.println("3 –Devolver livro");
            System.out.println("4 -Sair");
            System.out.println("Digite a opção: ");
            escolha = entrada.nextInt();
            
            switch(escolha){
                
                case 1: 
                    if(objLivro.getSituacao()){
                        System.out.println("Livro emprestado");
                    }else{
                        System.out.println("Livro Disponível");
                    }
                break;
                
                case 2: 
                    System.out.println("");
                    if(objLivro.getSituacao()){
                        System.out.println("O livro esta emprestado");
                    }else{
                        objLivro.emprestar();
                    }
                break;
                
                case 3: 
                    if(objLivro.getSituacao()){
                    System.out.println("Informe a quantidade de dias em atraso:");
                    diasAtraso = entrada.nextInt();
                    
                    System.out.println("Valor a ser pago: " + objLivro.devolver(diasAtraso));
                    }else{
                        System.out.println("O livro ja está disponivel");
                    }
                break;
                
            }
            
        }while(escolha<4);
    }
    
}
