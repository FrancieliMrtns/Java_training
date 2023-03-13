package Lista_exercicios;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		double dias;
		double horas;
		double minutos;
		double segundos;
		double dias_s;
		double horas_s;
		double minutos_s;
		double total_s;
		
		//Dias = 86400 segundos
		System.out.println("Digite o número de dias que desejar: ");
		dias = texto.nextInt();
		dias_s = dias*86400;
		
		//horas = 3600 segundos
		System.out.println("Digite o número de horas que desejar: ");
		horas = texto.nextInt();
		horas_s = horas*3600;
		
		//minutos = 60 segundos
		System.out.println("Digite o número de minutos que desejar: ");
		minutos = texto.nextInt();
		minutos_s = minutos*60;
		
		System.out.println("Digite o número de segundos que desejar: ");
		segundos = texto.nextInt();
		total_s = dias_s + horas_s + minutos_s;
		
		System.out.println("O total de segundos é: "+total_s);
		
		texto.close();
		
	}
	

}
