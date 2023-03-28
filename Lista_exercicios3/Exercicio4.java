package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		int num = 1;
		
		while (num != 11) {
			System.out.println("Nome: Aluno"+num);
			System.out.println("Digite o N1: ");
			int N1 = texto.nextInt();
			System.out.println("Digite O n2:");
			int N2 = texto.nextInt();
			int M = (N1+N2)/2;
			System.out.println("Sua média é: "+M);
			System.out.println("\n");
			num++;
		}
		texto.close();
		
		
		

	}

}
