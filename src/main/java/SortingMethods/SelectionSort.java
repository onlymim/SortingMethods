/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingMethods;

/**
 *
 * @author cliente
 */
public class SelectionSort {
    
    SelectionSort(int[] vet){
        int menor;
        int aux;
      for (int i= 0; i< vet.length; i++){
         menor = i; 
         for (int j= i + 1; j< vet.length; j++){
            if(vet[j] < vet[menor]){
            menor = j;
            }
         }
         
         aux= vet[menor];
         vet[menor] = vet[i];
         vet[i] = aux;
      }
      for (int i= 0; i< vet.length; i++){
          System.out.print(vet[i] + "\n");
      
      }
      
      
    };
    
}
