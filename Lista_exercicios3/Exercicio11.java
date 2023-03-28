package Lista_exercicios3;

public class Exercicio11 {
	public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int primeiro = i / 100;
            int segundo = i % 100;
            if ((primeiro + segundo) * (primeiro + segundo) == i) {
                System.out.println(i);
            }
        }
    }

}
