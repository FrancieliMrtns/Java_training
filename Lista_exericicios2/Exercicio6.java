package Lista_exericicios2;
import java.util.Scanner;

public class Exercicio6 {
	    public static void main(String[] args) {
	        Scanner texto = new Scanner(System.in);

	        System.out.print("Digite um ano aleatório: ");
	        int ano = texto.nextInt();

	        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
	            System.out.println("O ano "+ano + " é bissexto.");
	        } 
	        else {
	            System.out.println("O ano "+ano + " não é bissexto.");
	        }

	        texto.close();
	    }
	}


