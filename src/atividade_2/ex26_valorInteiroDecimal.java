package atividade_2;

/*
26. Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
Dica: utilize uma função de arredondamento.
 */
import java.util.Scanner;

public class ex26_valorInteiroDecimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe um valor");
        double valor = s.nextDouble();
        
        double condicao = valor % 1;
        
        System.out.println("condicao "+condicao);
        if (condicao != 0) {
            System.out.println("Valor decimal");
            
        }else{
            System.out.println("Valor inteiro");
        }
        
       
    }
}
