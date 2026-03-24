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
    
    // Metodo que ordena un arreglo de enteros usando el algoritmo Selection Sort
    public static void selectionSort(int[] arr) { // 1 + 5n + 3n2 => O(n2)
    int n = arr.length; // 1

    // Recorre el arreglo hasta la penúltima posición
    for (int i = 0; i < n - 1; i++) { // n
        // Se asume que la posición actual contiene el valor mínimo
        int indiceMinimo = i; // n

        // Busca el elemento más pequeño en la parte no ordenada del arreglo
        for (int j = i + 1; j < n; j++) { // n2
            // Compara el valor actual con el valor en la posición del mínimo
            if (arr[j] < arr[indiceMinimo]) { // n2
                indiceMinimo = j; // n2
            }
        }

        // Intercambia el elemento mínimo encontrado con la posición actual
        int aux = arr[indiceMinimo]; // n
        arr[indiceMinimo] = arr[i]; // n
        arr[i] = aux; // n
    }
    }
    
    // Metodo que ordena un arreglo de enteros usando el algoritmo Insertion Sort
    public static void insertionSort(int[] arr) { // 1 + 4n + 3n2 => O(n2)
    int n = arr.length; // 1

    // Recorre el arreglo desde la segunda posición
    for (int i = 1; i < n; i++) { // n
        // Guarda el valor actual que se va a insertar en su posición correcta
        int key = arr[i]; // n

        // Inicializa j con la posición anterior
        int j = i - 1; // n

        // Desplaza los elementos mayores que key una posición a la derecha
        while (j >= 0 && arr[j] > key) { // n2
            arr[j + 1] = arr[j]; // n2
            j = j - 1; // n2
        }

        // Inserta key en la posición correcta
        arr[j + 1] = key; // n
    }
}
    
    // Metodo principal para ordenar un arreglo usando Quick Sort
public static void quickSort(int[] arr) { // 1
    quickSort(arr, 0, arr.length - 1); // 1
}

// Metodo recursivo de Quick Sort
public static void quickSort(int[] arr, int inicio, int fin) { 
    if (inicio < fin) { // 
        int pivoteIndice = particion(arr, inicio, fin); // n

        // Ordena el subarreglo izquierdo
        quickSort(arr, inicio, pivoteIndice - 1); // T(n/2)

        // Ordena el subarreglo derecho
        quickSort(arr, pivoteIndice + 1, fin); // T(n/2)
    }

    // 2T(n/2) + n
    // Complejidad temporal promedio: O(n log n)
    // Peor caso: O(n^2)
}

// Metodo que coloca el pivote en su posicion correcta
public static int particion(int[] arr, int inicio, int fin) { // 6 +5n => O(n)
    int pivote = arr[fin]; // 1

    int i = inicio - 1; // 1

    for (int j = inicio; j < fin; j++) { // n
        if (arr[j] < pivote) { // n
            i++; // n

            int temp = arr[i]; // n
            arr[i] = arr[j]; // n
            arr[j] = temp; // n
        }
    }

    int temp = arr[i + 1]; // 1
    arr[i + 1] = arr[fin]; // 1
    arr[fin] = temp; // 1

    return i + 1; // 1
}
    
    // Metodo para imprimir los elementos del arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
 
    }
    
  
}
