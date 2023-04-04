package Lista_exercicios5matriz;
import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int linha = 10;
        int coluna = 10;
        int[][] matriz = new int[linha][coluna];
        Random aleatorio = new Random();
        Scanner texto = new Scanner(System.in);
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = aleatorio.nextInt(100);
            }
        }
        
        System.out.println("Matriz original:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        

        System.out.println("Digite qual coluna quer multiplicar:");
        int ColunaM = texto.nextInt();
        System.out.println("Vezes que número? ");
        int valorM = texto.nextInt();
        
        for (int i = 0; i < linha; i++) {
            matriz[i][ColunaM] *= valorM;
        }
        
        System.out.println("Coluna" + ColunaM + " vezes " + valorM + ":");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}