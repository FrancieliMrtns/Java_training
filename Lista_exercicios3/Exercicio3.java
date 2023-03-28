package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] sargs) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Digite um nome por favor: ");
		String nome = texto.nextLine();
		int num = 1 ;
		while (num != 10) {
			System.out.println(nome);
			num++;
			
		}
		texto.close();
			
		
		
	}

}
