/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingMethods;

/**
 *
 * @author cliente
 */
public class InsertionSort {
    InsertionSort(int[] vet){
    int aux, j;
    for(int i=1;i<vet.length;i++){
        aux = vet[i];
        j = i-1;
     while( j>=0 && vet[j] > aux ){
     vet[j+1] = vet[j];
     j--;
     }
     vet[j+1]= aux;
    }
    for (int i= 0; i< vet.length; i++){
          System.out.print(vet[i] + "\n");
      
      }
    
    }
    
}
