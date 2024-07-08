/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingMethods;

/**
 *
 * @author clientepackage
 */
public class BubbleSort {
    public BubbleSort(int[] vet ){
        int aux;
        Boolean controle = true;
        for(int i=0; i< vet.length; i++){
            for(int j =0; j< (vet.length -1); j++){
                
            if(vet[j]> vet[j +1]){
            aux= vet[j];
            vet [j] = vet [j+ 1] ;
            vet [j + 1] = aux;
            }
           
            }
            
      }
        for (int i =0; i< vet.length; i++){
            System.out.print(vet[i] + "\n");
        }
    }
}
