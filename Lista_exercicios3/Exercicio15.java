package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int n = texto.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int l = 1; l <= i; l++) {
                System.out.print(i * l + " ");
            }
            System.out.println();
        }
    }

}
