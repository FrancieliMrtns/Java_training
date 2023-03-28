package Lista_exercicios4;
import java.util.Random;

public class Exercicio7 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] vet = new int[10];
        int maxnum = 10;
        for (int i = 0; i < maxnum; i++) {
            int numero = aleatorio.nextInt(50) + 1;
            vet[i] = numero;
            System.out.println(numero);
        }

        int n = vet.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vet[j] > vet[j+1]) {
                    int temp = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado em ascendente:");
        for (int i = 0; i < maxnum; i++) {
            System.out.println(vet[i]);
        }
    }
}