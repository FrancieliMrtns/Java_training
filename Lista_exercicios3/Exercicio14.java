package Lista_exercicios3;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = texto.nextInt();
        int soma = 0;
        int impar = 1;
        
        while (soma < numero) {
            soma += impar;
            impar += 2;
        }
        
        if (soma == numero) {
            System.out.println(numero + " --> quadrado perfeito!");
        } else {
            System.out.println(numero + " não é quadrado perfeito :(");
        }
    }
}





