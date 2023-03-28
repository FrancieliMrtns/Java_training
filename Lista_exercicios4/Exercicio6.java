package Lista_exercicios4;

import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
public static void main(String[] args) {
Random aleatorio = new Random();
Scanner texto = new Scanner(System.in);

    int[] vetorA = new int[10];
    int[] vetorB = new int[10];
    int maxnum = 10;
    
    for (int i = 0; i < maxnum; i++) {
        int numero = aleatorio.nextInt(50) + 1; 
        vetorA[i] = numero; 
        System.out.println(numero);
    }
    
    System.out.print("Digite um valor para multiplicar: ");
    int x = texto.nextInt();
    
    for (int i = 0; i < maxnum; i++) {
        vetorB[i] = vetorA[i] * x;
    }
    
    System.out.println("Vetor A: ");
    for (int i = 0; i < maxnum; i++) {
        System.out.print(vetorA[i] + " ");
    }
    System.out.println();
    
    System.out.println("Vetor B: ");
    for (int i = 0; i < maxnum; i++) {
        System.out.print(vetorB[i] + " ");
    }
    System.out.println();
    
    texto.close();
}
}



