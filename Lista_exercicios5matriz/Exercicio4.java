package Lista_exercicios5matriz;
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
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
        System.out.print("Qual coluna vc quer imprimir? (que seja entre 1 e 4 por favor) ");
        int coluna = texto.nextInt() - 1;
        while (coluna < 0 || coluna > 3) {
            System.out.print("ERRO! Digite novamente (entre 1 e 4): ");
            coluna = texto.nextInt() - 1;
        }
        
        System.out.println("Elementos da coluna " + (coluna+1) + ":");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][coluna] + " ");
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