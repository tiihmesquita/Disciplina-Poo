
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Thiago Mesquita
 */
public class Aplic {

    public static void main(String[] args) {
        
        int escolha = 0;
        
        Aluno objAluno = new Aluno();
        Aluno objAluno2 = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Registro Acadêmico do Aluno");
        
        System.out.print("Nota da primeira prova :");
        objAluno.setNtPrv1(entrada.nextDouble());
        
        System.out.print("Nota da segunda prova :");
        objAluno.setNtPrv2(entrada.nextDouble());
        
        System.out.print("Nota do primeiro trabalho :");
        objAluno.setNtTrab1(entrada.nextDouble());
        
        System.out.print("Nota do primeiro trabalho :");
        objAluno.setNtTrab2(entrada.nextDouble());
        
        do{
            System.out.println("1- Exiba a nota das Provas/Trabalhos"); 
            System.out.println("2- Exiba a media das Provas/Trabalhos"); 
            System.out.println("3- Exiba a Media final"); 
            System.out.println("4- Sair"); 
            
            escolha = entrada.nextInt();
            
            switch(escolha){
                
                case 1:
                    System.out.println("Nota da prova 1: " + objAluno.getNtPrv1());
                    System.out.println("Nota da prova 2: " + objAluno.getNtPrv2());
                    System.out.println("Nota do trabalho 1: " + objAluno.getNtTrab1());
                    System.out.println("Nota do trabalho 2: " + objAluno.getNtTrab2()+"\n");
                    break;
                case 2:
                    System.out.println("Media das provas: "+objAluno.calcMediaProva());
                    System.out.println("Media dos trabalhos: "+objAluno.calcMediaTrab()+"\n");
                    break;
                case 3:
                    System.out.println("Media final: "+objAluno.calcMediaFinal()+"\n");
                    if(objAluno.calcMediaFinal()>= 6){
                        System.out.println("Aprovado");
                    }else{
                        System.out.println("Reprovado");
                    }
                    break;
              
            }
        }while(escolha<4);
    }  
}
