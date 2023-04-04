package Lista_exercicios5matriz;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][4];
        Random aleatorio = new Random();
        Scanner texto = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(50) + 1;
            }
        }
        
        System.out.println("Matriz:");
        imprimirMatriz(matriz);
        
        System.out.print("Qual linha quer imprimir? (Que esteja entre 0 e 6)");
        int linha = texto.nextInt() - 1;
        while (linha < 0 || linha > 6) {
            System.out.print("ERRO! Digite novamente (entre 0 e 6): ");
            linha = texto.nextInt() - 1;
        }
        
        System.out.println("Elementos da linha " + (linha+1) + ":");
        for (int j = 0; j < matriz[linha].length; j++) {
            System.out.print(matriz[linha][j] + " ");
        }
        System.out.println();
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
