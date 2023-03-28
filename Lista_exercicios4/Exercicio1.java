package Lista_exercicios4;
import java.util.Random;

public class Exercicio1 {
	    public static void main(String[] args) {
	        Random aleatorio = new Random();
	        
	        int[] vet = new int[10]; 
	        int maxnum = 10;
	        for (int i = 0; i < maxnum; i++) {
	            int numero = aleatorio.nextInt(50) + 1; 
	            vet[i] = numero; 
	            
	            if (numero % 2 == 0) {
	                System.out.println("par: "+numero);
	            } else {
	                System.out.println("Impar: "+numero );
	            }
	            
	        }
	    } 
	      
	

}
