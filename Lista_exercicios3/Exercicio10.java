package Lista_exercicios3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int soma = 0;
        String resposta = "S"; // Inicia a variável resposta com "S" para entrar no loop

        while (resposta.equals("S")) {
            System.out.print("Primeiro valor: ");
            int valor1 = texto.nextInt();
            System.out.print("Segundo valor: ");
            int valor2 = texto.nextInt();

            if (valor1 >= valor2) {
                System.out.println("Opa, o primeiro valor deve ser menor que o segundo valor.");
            } else {
                for (int i = valor1; i <= valor2; i++) {
                    soma += i;
                }
                System.out.println("A soma dos inteiros entre " + valor1 + " e " + valor2 + " é " + soma + ".");
            }
            
            System.out.print("Deseja executar o programa novamente? (S/N) ");
            resposta = texto.next();
        }
        
        System.out.println("Programa encerrado.");
        texto.close();
    }
}