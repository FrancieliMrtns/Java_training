package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
        Scanner texto= new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = texto.nextInt();
        
        int f1 = 1;
        int f2 = 1;
        int fib;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 3; i <= n; i++) {
            fib = f1 + f2;
            System.out.print(fib + " ");
            f1 = f2;
            f2 = fib;
            texto.close();
        }
    }

}
