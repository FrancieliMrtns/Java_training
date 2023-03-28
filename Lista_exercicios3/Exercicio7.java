package Lista_exercicios3;
import java.util.Random;

public class Exercicio7 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int[] vet = new int[20]; 
        int maxnum = 20;
        for (int i = 0; i < maxnum; i++) {
            int numero = aleatorio.nextInt(50) + 1; 
            vet[i] = numero; 
            System.out.println(numero);
            
        }
    }
}






