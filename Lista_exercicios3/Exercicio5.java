package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        int num, somaPar = 0, somaImpar = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = texto.nextInt();

            if (num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }
        }

        System.out.println("A soma dos números pares é: " + somaPar);
        System.out.println("A soma dos números ímpares é: " + somaImpar);

        texto.close();
    }
	

}
