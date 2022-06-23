package atividade_2;

/*
27. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga
se o número é:
o par ou ímpar;
o positivo ou negativo;
o inteiro ou decimal.

 */
import java.util.Scanner;

public class ex27 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double num1, num2, soma, subtracao, divisao, multiplicacao;
        int x;
        double todosValores = 0;
        
        System.out.println("1o numero");
        num1 = s.nextDouble();
        System.out.println("2o numero");
        num2 = s.nextDouble();    
        System.out.println("");
        System.out.println("Deseja fazer qual operação?");
        System.out.println("1: Adição");
        System.out.println("2: Subtração");
        System.out.println("3: Divisão");
        System.out.println("4: Multiplicação");
        x = s.nextInt();
        System.out.println("");
        
        
        /*
        
        SWITCH com os calculos e os resultados das 4 operações
        
        */
        
        switch (x){
            case 1:  //adição
            
            soma = num1+num2;
                System.out.println("Resultado da soma: "+soma);
                 
            todosValores = soma;  //variavel mestre
                break;
            
            case 2:  //subtração
                subtracao = num1-num2;
                System.out.println("Resultado da subtração: "+subtracao);
                
                todosValores = subtracao; //variavel mestre
                break;
                
            case 3:  //divisao
                if (num2!=0) {  //nao se divide por zero
                    divisao = num1/num2;
                    System.out.println("Resultado da divisão: "+divisao);
                    todosValores = divisao; //variavel mestre
            }else{ 
                    System.out.println("Impossivel dividir por zero");
                    System.out.println("Informe outro segundo número");
                }
                
            
            break;
            
            case 4: //multiplicação
                multiplicacao = num1*num2;
                System.out.println("Resultado da multiplicacao: "+multiplicacao);
                
                todosValores = multiplicacao;  //variavel mestre
            break;
        
            default:
                System.out.println("Valor indetectado");
        }
            
        
        /*
        todosValores = variavel q recebe o resultado da soma, subtração, mult, e divisao
        */
        
        
        /*
        apresentação final:
        */
        
        
        String escritoPar;
        
        double condicaoPar = todosValores % 2;
            if (condicaoPar==0) {
            escritoPar = "Par";
            
        }else{
            escritoPar = "Impar";
        }
        
        
            
        String escritoPositivo;
        
        if (todosValores>=0) {
            escritoPositivo = "Positivo";     
        }else{ 
            escritoPositivo = "Negativo";
        }
        
        
        
        String escritoDecimal;
        
        double condicao = todosValores % 1;
        
            if (condicao != 0) {
            escritoDecimal= "Valor decimal";
            
        }else{
            escritoDecimal = "inteiro";
        }
            
        System.out.println("-------");
        System.out.println(escritoPar);           //PAR        parImpar
        System.out.println(escritoPositivo);    //positivo   negOuPos
        System.out.println(escritoDecimal);    //decimal     decInt
        
    } //FIM DA VOID MAIN
    
    
    
    /*
    //METODO PRA VER SE É PAR OU IMPAR
   
     public static String parImpar(double todosValores){
        
        //fazer o if e condicao
        String escritoPar;
        
        double condicaoPar = todosValores % 2;
            if (condicaoPar==0) {
            escritoPar = "Par";
            
        }else{
            escritoPar = "Impar";
        }
        return escritoPar;
    } 
    
    
    
    
   // metodo pra ver se é positivo ou negativo
    
    public  String negOuPos(double todosValores){  
        
        String escritoPositivo;
        
        if (todosValores>=0) {
            escritoPositivo = "Positivo";     
        }else{ 
            escritoPositivo = "Negativo";
        }
        return escritoPositivo;
    } 
    
    
    
    
    
    //metodo pra ver se é decimal ou inteiro
      
    public  String decInt(double todosValores){  

        String escritoDecimal;
        
        double condicao = todosValores % 1;
        
            if (condicao != 0) {
            escritoDecimal= "Valor decimal";
            
        }else{
            escritoDecimal = "inteiro";
        }
            
        return escritoDecimal;
    } 
    */
} //FIM DA CLASSE
  