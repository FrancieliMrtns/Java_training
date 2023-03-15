package Lista_exericicios2;
import java.util.Scanner;

public class Exercicio1 {
	 public static void main(String[] args) {
	        Scanner texto = new Scanner(System.in);
	        System.out.print("Insira um número de tres algarismo, por favor: ");
	        int numero = texto.nextInt();
	        
	        
	        if (numero >= 1000 || numero < 100) {
	            System.out.println("Número inválido!");
	            return;
	        }
	        
	        int centena = numero / 100;
	        int dezena = (numero % 100) / 10;
	        int unidade = numero % 10;
	        
	        
	        if (centena < dezena && dezena < unidade) {
	            System.out.println(numero + " = ascendente.");
	        } else {
	            System.out.println(numero + " =  não é ascendente.");
	        }
	        texto.close();

}
}
