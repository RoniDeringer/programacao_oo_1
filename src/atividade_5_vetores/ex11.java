package atividade_5_vetores;
import java.util.Scanner;
/*
11. Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta data e coloque
cada item em uma posição de um vetor de inteiros de tamanho 3.
*/

public class ex11{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        boolean condicao = false;
        int vetor[] = new int [3];
        
        do {
            System.out.println("Dia:");
        int dia = s.nextInt();
        if (dia>0 && dia<32) {
            vetor[0]= dia;
            condicao=true;
        }else{
            System.out.println("Numero Invalido, informe dnv");
            condicao=false;
        }
        } while (condicao==false);
        
        /*
        mes:
        */
        System.out.println("");
        do {
            System.out.println("Mes:");
            int mes= s.nextInt();
            if (mes>0 && mes<13) {
                vetor[1]=mes;
                condicao=true;
            }else{
                condicao = false;
                System.out.println("Invalido");
            }
        } while (condicao==false);
        
        
        /*
        ano
        */
        System.out.println("");
        do {
            System.out.println("Ano:");
            int ano = s.nextInt();
            if (ano>1800 && ano<2022) {
                vetor[2]=ano;
                condicao=true;
            }else{
                System.out.println("Invalido");
                condicao = false;
            }
            
        } while (condicao==false);
        System.out.println("____SAIDA____");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print(vetor[i]+"/");
        }
       
    }    
}
