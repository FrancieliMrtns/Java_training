package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio6 {
	 public static void main(String[] args) {
	        Scanner texto = new Scanner(System.in);

	        System.out.print("Quantos números você deseja?: ");
	        int numeros = texto.nextInt();

	        int somaPares = 0;
	        int somaImpares = 0;

	        for (int i = 0; i < numeros; i++) {
	            System.out.print("Digite o " + (i + 1) + " número: ");
	            int numero = texto.nextInt();

	            if (numero % 2 == 0) {
	                somaPares += numero;
	            } else {
	                somaImpares += numero;
	            }
	        }

	        System.out.println("Soma dos números pares: " + somaPares);
	        System.out.println("Soma dos números ímpares: " + somaImpares);
	        texto.close();
	    }

}
