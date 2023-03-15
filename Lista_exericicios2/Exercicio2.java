package Lista_exericicios2;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.print("Digite os 4 dígitos da placa: ");
        int placa = texto.nextInt();

        
        int ultimoDigito = placa % 10;
        
        
        if (ultimoDigito == 1 || ultimoDigito == 2) {
            System.out.println("O dia de ir é na segunda feira");
        } else if (ultimoDigito == 3 || ultimoDigito == 4) {
            System.out.println("O dia de ir é na terça-feira");
        } else if (ultimoDigito == 5 || ultimoDigito == 6) {
            System.out.println("O dia de ir é na quarta-feira");
        } else if (ultimoDigito == 7 || ultimoDigito == 8) {
            System.out.println("O dia de ir é na quinta-feira");
        } else if (ultimoDigito == 9 || ultimoDigito == 0) {
            System.out.println("O dia de ir é na sexta-feira");
        } else {
            System.out.println("Não existe, reinicie o programa");
        }
        texto.close();
    }
        
	}
	


