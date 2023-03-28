package Lista_exercicios4;
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner texto = new Scanner(System.in);
        
        int[] vet = new int[20]; 
        int maxnum = 20;
        for (int i = 0; i < maxnum; i++) {
            int numero = aleatorio.nextInt(50) + 1; 
            vet[i] = numero; 
            System.out.println(numero);
        }
        
        System.out.print("Digite um dos números para verificar seus múltiplos: ");
        int num = texto.nextInt();
        System.out.println("Números múltiplos de " + num + ":");
        for (int i = 0; i < maxnum; i++) {
            if (vet[i] % num == 0) {
                System.out.println(vet[i]);
            }
        }
    }
}
