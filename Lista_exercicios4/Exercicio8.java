package Lista_exercicios4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner texto = new Scanner(System.in);

        int[] vetA = new int[20]; 
        int[] vetB = new int[20]; 
        int[] vetC = new int[20]; 
        int maxnum = 20;
        
        for (int i = 0; i < maxnum; i++) {
            int numero = aleatorio.nextInt(50) + 1; 
            vetA[i] = numero; 
            System.out.println(numero);
        }

        int posB = 0;
        int posC = 0;

        for (int i = 0; i < maxnum; i++) {
            if (vetA[i] % 2 == 0) {
                vetB[posB] = vetA[i];
                posB++;
            } else {
                vetC[posC] = vetA[i];
                posC++;
            }
        }

        System.out.print("Vetor B (pares): ");
        for (int i = 0; i < posB; i++) {
            System.out.print(vetB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C (impares): ");
        for (int i = 0; i < posC; i++) {
            System.out.print(vetC[i] + " ");
        }
        System.out.println();
    }
}
