package Lista_exercicios;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		int A;
		int B;
		
		
		System.out.println("Digite o primeiro número: ");
		A = texto.nextInt();
		System.out.println("Digite o segundo número: ");
		B = texto.nextInt();
		
		int C = A;
		A = B;
		B = C;
		
		
		System.out.printf("Os números trocados ficaram: "+A +","+B);
		
		texto.close();
		
		
		
		
		
		
	}

}
