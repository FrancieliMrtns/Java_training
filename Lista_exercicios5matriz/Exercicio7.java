package Lista_exercicios5matriz;
import java.util.Scanner;
import java.util.Random;

public class Exercicio7{
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random aleatorio = new Random();
        Scanner texto = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(100);
            }
        }
        
        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        System.out.print("Qual linha deseja copiar?: ");
        int linha = texto.nextInt() - 1;
        int[] vetor = new int[10];
        for (int i = 0; i < matriz[linha].length; i++) {
            vetor[i] = matriz[linha][i];
        }
        System.out.println("Vetor:");
        imprimirVetor(vetor);
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%4d", vetor[i]);
        }
        System.out.println();
    }
}