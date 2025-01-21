/*
 Participantes:
Jeverlin Ramos  ID: 10154300
Nicol Sanchez   ID: 10151785
 */


import java.util.Scanner;

public class CribaDeEratostenes {
    public static void main(String[] args) {

        System.out.println("Valor de n: ");
        Scanner scanner = new Scanner(System.in);
        int cantNumerosArr = scanner.nextInt();

        long tiempo1 = System.nanoTime();
        System.out.println(" tiempo 1: " + tiempo1);

        boolean[] numPrimos = new boolean[cantNumerosArr + 1];

        for (int indice = 2; indice <= cantNumerosArr; indice++) {
            numPrimos[indice] = true;
        }

        for (int indice = 2; indice * indice <= cantNumerosArr; indice++) {
            if (numPrimos[indice] == true) {
                for (int indice2 = indice * indice; indice2 <= cantNumerosArr; indice2 += indice) {
                    numPrimos[indice2] = false;
                }
            }
        }

        for (int indice = 2; indice <= cantNumerosArr; indice++) {
            if (numPrimos[indice] == true) {
                System.out.print(indice + " \n");
            }
        }

        long tiempo2 = System.nanoTime();
        System.out.println("tiempo 2: " + tiempo2);

        long tiempoResta = tiempo2 - tiempo1;
        System.out.println("\ntiempo transcurrido: " + tiempoResta);
    }
}
