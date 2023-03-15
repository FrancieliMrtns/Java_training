package Lista_exericicios2;
import java.util.Scanner;

public class Exercicio4 {
	 public static void main(String[] args) {
		 Scanner texto = new Scanner(System.in);
		 System.out.println("Digite o primeiro lado: ");
		 int lado1 = texto.nextInt();
		 System.out.println("Digite o segundo lado: ");
		 int lado2 = texto.nextInt();
		 System.out.println("Digite o terceiro lado: ");
		 int lado3 = texto.nextInt();
		 
		 if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
	         if (lado1 == lado2 && lado2 == lado3) {
	            System.out.println("O triângulo é equilátero.");
	         } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3)  {
	             System.out.println(" Triângulo isósceles");       
	             
	         }  
	         else if (!(lado1 == lado2 && lado2 == lado3 && lado3 == lado1)) {
	             System.out.println(" Triângulo escaleno ");       
	         }
	         
	      } else {
	         System.out.println("Os valores informados não formam um triângulo.");
	      }
		 texto.close();
	

}
}