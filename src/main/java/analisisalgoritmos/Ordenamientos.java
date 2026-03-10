/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisisalgoritmos;

/**
 *
 * @author luisk
 */
public class Ordenamientos {
    
    // Metodo que ordena un arreglo de enteros usando el algoritmo Bubble Sort
    public static void bubbleSort(int[] arreglo) {
        // Se obtiene la longitud del arreglo
        int n = arreglo.length;

        // Ciclo externo: controla el numero de pasadas
        for (int i = 0; i < n - 1; i++) {
            // Ciclo interno: compara elementos adyacentes
            // En cada pasada, el elemento mayor va quedando al final
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    
    // Metodo para imprimir los elementos del arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
 
    }
    
  
}
