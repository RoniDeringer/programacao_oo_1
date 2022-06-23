package atividade_3_repeticao;
import java.util.Scanner;

/*
8. Altere o programa anterior para mostrar no final a soma dos números.

*/

public class ex08{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int variavel = 0;
        int soma =0;
        System.out.println("numero1");
        int num1 = s.nextInt();
        System.out.println("numero2");
        int num2 = s.nextInt();
        System.out.println("----");
        
        
        if (num1 > num2) {
            variavel = num2;
           
            while (num1 > (variavel+1)) {  //pra nao mostrar o ultimo numero 
                variavel++;
                soma +=variavel;
            }
            
            
            
        } else {
            variavel = num1;
          
            while (num2 > (variavel+1)) {//pra nao mostrar o ultimo numero 
                variavel++;
                soma += variavel;
            }

        }
        System.out.println("Soma: "+ soma);
    }
}

   
       

