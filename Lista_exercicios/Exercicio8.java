package Lista_exercicios;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		int km;
		int dias;
		int preco_dia = 60;
		double preco_km = 0.15;
		
		System.out.println("Quantidade de km percorridos por um carro alugado pelo usuário:  ");
		km = texto.nextInt();
		System.out.println("Quantidade de dias pelos quais o carro foi alugado: ");
		dias = texto.nextInt();
		
		double total_km = km*preco_km;
		double total_dia = dias*preco_dia;
		
		double total_final = total_km + total_dia;
		
		System.out.println("O preço do carro alugado será de: "+total_final);
		
		texto.close();
		
		
	}
	

}
