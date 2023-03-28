package Lista_exercicios4;
import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int somaPares = 0;
		int countPares = 0;
        
        int[] vet = new int[20]; 
        int maxnum = 20;
        for (int i = 0; i < maxnum; i++) {
            int numero = aleatorio.nextInt(50) + 1; 
            vet[i] = numero; 
            System.out.println(numero);
            if (numero % 2 == 0) {
                somaPares += numero;
                countPares++;
            }
        }
        if (countPares > 0) {
            double mediaPares = (double) somaPares / countPares;
            System.out.println("Média dos números pares: " + mediaPares);
        } else {
            System.out.println("Não há números pares no vetor.");
        }
    }
}