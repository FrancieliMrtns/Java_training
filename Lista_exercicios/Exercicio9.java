package Lista_exercicios;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		double F;
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		F = texto.nextInt();
		
		//conversão
		
		double C = ((F-32)/9)*5;
		System.out.println("O valor convertido em fahrenheit é: "+C);
		
		texto.close();
	}
	
	
	

}
