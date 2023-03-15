package Lista_exericicios2;
import java.util.Scanner;

public class Exercicio3 {
	 public static void main(String[] args) {
	        Scanner texto = new Scanner(System.in);
	        int op;
	        double base;
	        double altura;
	        
	        System.out.print("Digite 1 para retângulo ou 2 para triângulo: ");
	        op = texto.nextInt();
	        System.out.print("Valor da base: ");
	        base = texto.nextDouble();
	        System.out.print("Valor da altura: ");
	        altura = texto.nextDouble();

	        double area = 0;
	        if (op == 1) {
	            area = base * altura;
	            System.out.println("A área do retângulo é: " + area);
	        } else if (op == 2) {
	            area = (base * altura) / 2;
	            System.out.println("A área do triângulo é: " + area);
	        } else {
	            System.out.println("Opção inválida.");
	        }
	        texto.close();
	    }
	 	






}
