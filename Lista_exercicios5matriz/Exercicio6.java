package Lista_exercicios5matriz;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random aleatorio = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(50) + 1;
            }
        }
        
        imprimirMatriz(matriz);   
        for (int j = 0; j < matriz[0].length; j++) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }
            System.out.println("Soma dos numeros da coluna " + (j+1) + ": " + soma);
        }
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
