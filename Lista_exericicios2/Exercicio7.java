package Lista_exericicios2;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int a;
        int b;
        int c;
        String s_n = "";

        System.out.println("Seja bem vindo. Este programa organizará os números de maneira crescente.\n  ");

        
         
                System.out.println("Digite um número: ");
                
                a = texto.nextInt();
                System.out.println("Digite o segundo número: ");
                
                b = texto.nextInt();
                System.out.println("Digite o terceiro e último, por favor: ");
                
                c = texto.nextInt();
                texto.nextLine();

                if (a <= b && a <= c) {
                    if (b <= c) {
                        System.out.println(a + ", " + b + ", " + c);
                    } else {
                        System.out.println(a + ", " + c + ", " + b);
                    }
                } else if (b <= a && b <= c) {
                    if (a <= c) {
                        System.out.println(b + ", " + a + ", " + c);
                    } else {
                        System.out.println(b + ", " + c + ", " + a);
                    }
                } else {
                    if (a <= b) {
                        System.out.println(c + ", " + a + ", " + b);
                    } else {
                        System.out.println(c + ", " + b + ", " + a);
                    }
                }texto.close();
            }
				
        
        
    }
	


