package Lista_exercicios4;
import java.util.Random;

public class Exercicio9 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] vet = new int[10];
        int maxnum = 10;
        int i = 0;
        while (i < maxnum) {
            int num = aleatorio.nextInt(50) + 1;
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (vet[j] == num) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                vet[i] = num;
                System.out.println(num);
                i++;
            }
        }
    }
}
