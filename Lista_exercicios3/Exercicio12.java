package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = texto.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.printf("%d! = %d", n, fatorial);

        texto.close();
    }
}