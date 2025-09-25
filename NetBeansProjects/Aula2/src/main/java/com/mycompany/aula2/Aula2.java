/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2;

/**
 *
 * @author aluno
 */
public class Aula2 {
    
public static void main(String[]args){
    Scanner scanner = new Scanner( System.in);
    System.out.println("======Calculadora======");
    System.out.println("Digite o primeiro número");
    double num1 = scanner.nextDouble();
    
    System.out.println("digite o segundo número");
    double num2 = scanner.nextDouble();
    
   System.out.println("Escolha a operação");
   System.out.println("1 -Soma (+)");
   System.out.println("2 - subtração (-)");
   System.out.println("3 - Multiplicação (*) ");
   System.out.println("4 - Divisão (/)");
   System.out.println("Opção");
   int opcao = scanner.netInt();
   
   double resultado = 0;
   boolean valido = true;
           
   switch(opcao){      
       case 1: resultado = num1 + num2; break;
       case 2: resultado = num1 - num2; break;
       case 3: resultado = num1 * num2; break;
       case 4: if(num2!= 0){
               resultado = num1 / num2;
       } else {
           System.out.println( "Erro");
           valido = false;
       }
       break;
       default:
           System.out.println( "Opção inválida");
           valido = false;      
}
if (valido) {
    System.out.println("Resultado" + resultado);
}
   scanner.close();
                
        
        
   
       
    }
}
