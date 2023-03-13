package Lista_exercicios;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner texto = new Scanner(System.in);
		int numero_um;
		int numero_dois;
		
		System.out.println("Digite o primeiro número para a soma: ");
		numero_um = texto.nextInt();
		System.out.println("Digite o segundo número para a soma: ");
		numero_dois = texto.nextInt();
		System.out.printf("%d + %d = %d ",numero_um,numero_dois,numero_um + numero_dois);
		
		texto.close();

		
		
	}
	
	
	
	
	

}
