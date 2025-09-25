/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula;

/**
 *
 * @author aluno
 */
public class Aula {

    public static void main(String[] args) {
        
       String[][] nomes = {{"Ana","Bruno","Carla","Daniel"},
           {"Pedro","Yasmin","Vera","Tatiana"},
           {"Rafael","Raylla","jao","matheus"},
           {"Gabriela","Evelyn","Carla","Débora"},
           {"Ana","Tiana","Marta","Daniel"}};
       for(int i =0; i < nomes.length; i++){
           System.out.print("Linha"+ (1 + 1)+": ");
           for(int j=0; j < nomes[i].length; j++){
               System .out.println(nomes[i][j]+ "\t");
           }
              
       }
    }
}
