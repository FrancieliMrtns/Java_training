package Lista_exercicios4;
import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
        
        int[] vet = new int[10]; 
        int maxnum = 10;
        for (int i = 0; i < maxnum; i++) {
            int numero = aleatorio.nextInt(50) + 1; 
            vet[i] = numero; 
            System.out.println(numero);
        }
        
        System.out.println("Ordem direta:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        
        System.out.println("\nOrdem inversa:");
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.print(vet[i] + " ");
        }
    }
}