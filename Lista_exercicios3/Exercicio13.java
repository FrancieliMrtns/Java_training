package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        System.out.print("Digite um número para sabermos se é primo ou não: ");
        int num = texto.nextInt();

        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(num + " é número primo.");
        } else {
            System.out.println(num + " não é número primo.");
        }
    }
}
