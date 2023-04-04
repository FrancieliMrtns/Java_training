package Lista_exercicios5matriz;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int linha = 10;
        int coluna = 10;
        int[][] matriz = new int[linha][coluna];
        Random aleatorio = new Random();
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = aleatorio.nextInt(50) + 1;
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        int menor = matriz[0][0];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("Menor elemento da matriz: " + menor);
    }
}