package atividade_2;

/*
16. Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a
média. De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado

 */
import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a 1a nota");
        double nota1 = s.nextDouble();
        System.out.println("Informe a 2a nota");
        double nota2 = s.nextDouble();
        
        double media = (nota1+nota2)/2;
        
        if (media<=3) {
            System.out.println("REPROVADO");            
        }else if(media<=6.9){
            System.out.println("EM EXAME");
            
        }else{
            System.out.println("APROVADO");
        }
        
        
    }
}
