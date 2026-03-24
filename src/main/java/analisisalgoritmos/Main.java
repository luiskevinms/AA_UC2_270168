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
        int[] arreglo = {4, 2, 4, 3, 1, 4};

        System.out.println("Arreglo original:");
        Ordenamientos.imprimirArreglo(arreglo);

        Ordenamientos.quickSort(arreglo);

        System.out.println("Arreglo ordenado:");
        Ordenamientos.imprimirArreglo(arreglo);
    }
}
