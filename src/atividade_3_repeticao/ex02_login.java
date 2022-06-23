package atividade_3_repeticao;
import java.util.Scanner;

/*
2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

*/

public class ex02_login{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         boolean condicao;
         
         System.out.println("Informe seu nome: ");
         String nome = s.next();
         System.out.println("Crie uma senha:");
         String senha = s.next();
         System.out.println("");
        do {
            
            
            if (senha.contains(nome)) {
                condicao = false;
                System.out.println("Login criado");
            } else {
                condicao = true;       //vai receber TRUE enquanto informar numero errado
                System.out.println("senha inválida, crie outra senha");
                System.out.println("--------");
                System.out.println("Nova Senha:");
                senha = s.next();
            }

        }while (condicao == true);  //enquanto condicao receber TRUE vai executar
        System.out.println("-----");
        System.out.println("Nome: "+nome);
        System.out.println("Senha: "+senha);
              
    }    
}
