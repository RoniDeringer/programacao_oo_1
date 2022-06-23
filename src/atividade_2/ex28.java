package atividade_2;

/*
28. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas
são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como
"Inocente".
 */
import java.util.Scanner;

public class ex28 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        char resp1, resp2, resp3, resp4, resp5;
       int cont = 0;
        
        System.out.println("Telefonou para a vítima?");
        resp1 = s.next().charAt(0);
        System.out.println("Esteve no local do crime?");
        resp2 = s.next().charAt(0);
        System.out.println("Mora perto da vítima?");
        resp3 = s.next().charAt(0);
        System.out.println("Devia para a vítima?");
        resp4 = s.next().charAt(0);
        System.out.println("Já trabalhou com a vítima?");
        resp5 = s.next().charAt(0);
        
        if (resp1 == 's') {
            cont++;
            
        }if (resp2 == 's') {
            cont++;
            
        }if (resp3 == 's') {
            cont++;
            
        }if (resp4 == 's') {
            cont++;
            
        }if (resp5 == 's') {
            cont++;
            
        }
        if (cont>=5) {
            System.out.println("Assassino");
            
        }else if (cont>=3) {
            System.out.println("Cúmplice");
            
        }else if (cont>=2) {
            System.out.println("Suspeita");
        }else{
            System.out.println("Inocente");
        }
        
        
    }
}
