package atividade_2;

/*
25. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a
valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas
disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de
600 reais. O programa não deve se preocupar com a quantidade de notas existentes na
máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma
nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma
nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

 */
import java.util.Scanner;

public class ex25_caixaEletronico {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int saque, cem, cinq, dez, cinc, um;

        System.out.println("VALOR DO SAQUE");
        saque = s.nextInt();
        
        if ( (saque>=10) && (saque<=600) ) {
            
            if (saque>=100) {                  //maior q 100
                cem = saque/100;               //qtd de notas de 100
                saque = saque %  100;          //tirei as centenas do valor
                
                System.out.println("notas de cem: "+cem);
                System.out.println("Valor faltante "+saque);
                System.out.println("-----------------");
                
     
            }if (saque>=50) {                         //50          
                cinq = saque/50;               
                saque = saque %  50; 
                System.out.println("notas de 50: "+cinq);
                System.out.println("Valor faltante  "+saque);
                System.out.println("-----------------");
                
            }if (saque>=10) {                 //maior q 10           
                dez = saque/10;               
                saque = saque %  10; 
                System.out.println("notas de 10: "+dez);
                System.out.println("Valor faltante  "+saque);   
                System.out.println("-----------------");
               
            }if (saque>=5) {                     //maior q 5    
                cinc = saque/5;               
                saque = saque %  5; 
                System.out.println("notas de 5: "+cinc);
                System.out.println("Valor faltante  "+saque);   
                System.out.println("-----------------");    
            
            }if (saque>=1) {                     //maior q 1    
                um = saque/1;               
                saque = saque %  1; 
                System.out.println("notas de 1: "+um);  
              
                
            }          
        }else{
            System.out.println("Inserir um valor entre 10 a 600");
        }
        
    }
}
