package Lista_exercicios4;
import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int[] vet = new int[20]; 
        int maxnum = 20;
        for (int i = 0; i < maxnum; i++) {
            int numero = aleatorio.nextInt(50) + 1; 
            vet[i] = numero; 
            System.out.println(numero);
        }
        
        System.out.println("Números múltiplos de 5:");
        for (int i = 0; i < maxnum; i++) {
            if (vet[i] % 5 == 0) {
                System.out.println(vet[i]);
            }
        }
    }
}