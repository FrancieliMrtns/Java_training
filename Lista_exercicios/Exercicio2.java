package Lista_exercicios;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		int valor1;
		int valor2;
		int valor3;
		double media;
		
		System.out.println("Bem vindo a calculadora de média\n");
		System.out.println("Digite o primeiro valor: ");
		valor1 = texto.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = texto.nextInt();
		System.out.println("Digite o terceiro valor: ");
		valor3 = texto.nextInt();
		
		media = (valor1 + valor2 + valor3) / 3.0;
		System.out.println("A média dos valores é: "+media);
		
		texto.close();

		
		
	}
	

}
