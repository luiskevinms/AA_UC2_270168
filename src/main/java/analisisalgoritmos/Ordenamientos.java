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
    public static void bubbleSort(int[] arreglo) { //  1 + n + 5n2 => O(n2)
        // Se obtiene la longitud del arreglo
        int n = arreglo.length; // 1

        // Ciclo externo: controla el numero de pasadas
        for (int i = 0; i < n - 1; i++) { // n
            // Ciclo interno: compara elementos adyacentes
            // En cada pasada, el elemento mayor va quedando al final
            for (int j = 0; j < n - i - 1; j++) { // n2
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arreglo[j] > arreglo[j + 1]) { // n2 
                    int temp = arreglo[j]; // n2
                    arreglo[j] = arreglo[j + 1]; // n2
                    arreglo[j + 1] = temp; // n2 
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
