package atividade_5_vetores;
import java.util.Scanner;
/* 
16. Faça um programa que use um vetor de tamanho N (constante), peça ao usuário para
informar os valores que devem ser validados, somente devem ser aceitos valores entre 0 e 20
(inclusive 0 e 20). Após isto deve ser gerado um gráfico com cada um dos valores conforme
o exemplo abaixo (levando em consideração que os valores informados no vetor foram 4, 2
1:
4: ####
2:##
1:#

*/

public class ex16{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
    int vetor[] = new int [10];
    int num =0;
   
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("");
            System.out.println("num:");
            num = s.nextInt();
            if ((num>=0) && (num<=20)) {
                System.out.print(num+": ");
                for (int j = 0; j < num; j++) {
                    System.out.print("#");
                }
                
            }else{
                System.out.println("Valor invalido");
            }
            System.out.println("");
        }
        
       
    }    
}
