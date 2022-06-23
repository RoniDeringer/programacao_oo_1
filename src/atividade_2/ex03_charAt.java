package atividade_2;
import java.util.Scanner;
/*
    Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
    escrever: F - Feminino, M - Masculino.
*/
public class ex03_charAt{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Inform 'F' para feminino e 'M' para masculino");
        char sexo = s.next().charAt(0);
        switch (sexo){
            case 'f':
                System.out.println("Feminino");
                break;
                
            case 'm':
                System.out.println("Masculino");
                break;
        }
       
    }    //char sexo = s.next().charAt(0);
}
 