package atividade_2;
/*
8. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
calcular a média alcançada pelo aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete; 
 */
import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a 1a nota");
        double nota1 = s.nextDouble();
        System.out.println("Informe a 2a nota");
        double nota2 = s.nextDouble();
        
        double media = (nota1+nota2)/2;
        
        if (media>=7) {
            System.out.println("APROVADO");            
        }else{
            System.out.println("REPROVADO");
            
        }

        
    }
}
