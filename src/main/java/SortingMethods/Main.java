/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingMethods;

/**
 *
 * @author cliente
 */
public class Main {
      public static void main(String[] args){
      int[] vet = new int[10];
      for(int i = 0; i< vet.length; i++){
         vet[i] = (int) (Math.random()* vet.length);
      }
      for (int i = 0; i< vet.length; i++){
          
          
              System.out.print(vet[i] + "\n");
              
        }
      
      System.out.print( "\n \n");
      
            
      
     InsertionSort insertionSort = new InsertionSort(vet );
      
      
      }
      
    
}
