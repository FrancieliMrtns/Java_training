package Lista_exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		int metros;
		int milimetros;
		
		System.out.println("Bem vindo ao conversor de metros para milimetros!\n");
		//1 metro = 100 centimetros = 1000 milímetros
		System.out.println("Digite o valor do metro: ");
		metros = texto.nextInt();
		milimetros = metros*1000;
		System.out.println("O valor me milimetros é: "+milimetros);
		
		texto.close();
		
	}
	

}
