package Lista_exercicios5matriz;
import java.util.Random;

public class Exercicio9 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random aleatorio = new Random();
        
 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
            }
        }
        
        System.out.println("Matriz 1:");
        imprimirMatriz(matriz);
        
        for (int i = 0; i < matriz.length; i++) {
            int valor = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - i - 1];
            matriz[i][matriz.length - i - 1] = valor;
        }
      
        System.out.println("Matriz 2 trocada:");
        imprimirMatriz(matriz);
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