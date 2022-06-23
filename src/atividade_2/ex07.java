package atividade_2;

/*
7. Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */
import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o 1o num");
        double num1 = s.nextDouble();
        System.out.println("Informe o 3o num");
        double num2 = s.nextDouble();
        System.out.println("Informe o 2o num");
        double num3 = s.nextDouble();

        double menor = 0;
        double meio  = 0;
        double maior = 0;
        
        if ((num1 > num2) && (num1 > num3) && (num2 > num3)) {
            //1 2 e 3
            maior= num1; meio=num2; menor=num3;
            
        } else if ((num1 > num2) && (num1 > num3) && (num3 > num2)) {
            //1 3 e 2
            maior=num1; meio=num3; menor=num2;
            
        } else if ((num2 > num3) && (num2 > num1) && (num1 > num3)) {
            //2 1 e 3
            maior=num2; meio=num1; menor=num3;
            
        } else if ((num2 > num3) && (num2 > num1) && (num3 > num1)) {
            //2 3 e 1
            maior=num2; meio=num3; menor=num1;
            
        } else if ((num3 > num1) && (num3 > num2) && (num1 > num2)) {
            //3 1 e 2 
            maior=num3; meio=num1; menor=num2;
            
        } else if ((num3 > num1) && (num3 > num2) && (num2 > num1)) {
            //3 2 e 1
            maior=num3; meio=num2; menor=num1;
        }
        
        System.out.println("ORDEM DECRESCENTE:");
        System.out.println("");
        System.out.println(menor+" - "+meio+" - "+maior);
        
        
          // 3! = 6
    }

}

