package Lista_exericicios2;
import java.util.Scanner;


public class Exercicio5 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		System.out.println("Valor do primeiro ângulo:");
		int angulo1 = texto.nextInt();
		System.out.println("Valor do segundo ângulo:");
		int angulo2 = texto.nextInt();
		System.out.println("Valor do terceiro ângulo:");
		int angulo3 = texto.nextInt();
		
		int soma;
		soma = angulo1 + angulo2 +angulo3;
		if (soma < 180) {
            
            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                System.out.println("Triângulo retângulo.");
            } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                System.out.println("Triângulo obtusângulo.");
            } else {
                System.out.println("Triângulo acutângulo.");
            }
        }else{
            System.out.println("Não é um triângulo válido.");
        }
        texto.close();
		}
	}
	
	
	
		
	


