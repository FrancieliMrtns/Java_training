package Lista_exercicios4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int maxnum = 10;
        for (int i = 0; i < maxnum; i++) {
            int numero = aleatorio.nextInt(50) + 1;
            vet[i] = numero;
            System.out.println(numero);
        }

        System.out.print("Digite um número: ");
        int numeroDigitado = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == numeroDigitado) {
                encontrado = true;
                break;
            }
        }

        System.out.println("Vetor: " + Arrays.toString(vet));
        if (encontrado) {
            System.out.println("Número encontrado.");
        } else {
            System.out.println("Número não encontrado.");
        }
    }
}
