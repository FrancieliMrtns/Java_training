package Lista_exercicios;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		
		double salario;
		double aumento;
		double porcentagem;
		double novoSalario;
		System.out.println("Digite seu salário atual: ");
		salario = texto.nextInt();
		System.out.println("Digite o aumento recebido: ");
		aumento = texto.nextInt();
		
		//Salario = número quebrado; Aumento = porcentagem
		porcentagem = salario/100*aumento;
		novoSalario = salario+porcentagem;
		
		System.out.println("O valor atual de salário será: "+novoSalario);
		
		
		texto.close();
		
		
		
		
		
		
		
		
		
	}
	
	

}
