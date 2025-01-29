import java.util.*;

public class OrdenarArreglo {

    public static void main(String[] args) {

        
        int tamArreglo = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Tamaño del arreglo: ");
            tamArreglo = sc.nextInt();
            if (tamArreglo % 2 != 0) {
                System.out.println("El tamaño del arreglo debe ser par");
            }
        } while (tamArreglo % 2 != 0);

        String[] arreglo = new String[tamArreglo];
        for (int i = 0; i < tamArreglo; i++) {
            System.out.println("Ingresar el valor " + (i + 1) + ": ");
            arreglo[i] = sc.next();
        }

        for (int i = 0; i < tamArreglo; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Ingrese el valor de T: ");
        int T = sc.nextInt();
        System.out.println("\n");

        // Ordenar

        int mitad = tamArreglo / 2;

        T = T-1;
        

        // Desplazar elementos a la izquierda
        for (int i = 0; i < T; i++) {
            String temp = arreglo[0];  // Guardar el primer elemento
            for (int j = 0; j < mitad - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }
            arreglo[mitad - 1] = temp;  // Poner el elemento guardado al final de la primera mitad
        }

        // Desplazar elementos a la derecha
        for (int i = 0; i < T; i++) {
            String temp = arreglo[tamArreglo - 1];  // Guardar el último elemento de la segunda mitad
            for (int j = tamArreglo - 1; j > mitad; j--) {
                arreglo[j] = arreglo[j - 1];
            }
            arreglo[mitad] = temp;  // Colocar el último elemento guardado al inicio de la segunda mitad
        }


        for (int i = 0; i < tamArreglo; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }



}
