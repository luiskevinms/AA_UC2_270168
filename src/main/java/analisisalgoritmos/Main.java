/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisalgoritmos;

import java.util.Arrays;

/**
 *
 * @author luisk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {10, 4, 24, 3, 8, 12};

        System.out.println("Arreglo original:");
        Ordenamientos.imprimirArreglo(arreglo);

        Ordenamientos.insertionSort(arreglo);

        System.out.println("Arreglo ordenado:");
        Ordenamientos.imprimirArreglo(arreglo);
    }
}
