package Lista_exercicios;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		double combustivel;
		int desempenho;
		int distancia;
		String cidade1;
		String cidade2;
		
		
		System.out.println("Digite o preço médio do combustível: ");
		combustivel = texto.nextInt();
		System.out.println("Quantidade de KM  por litro: ");
		desempenho = texto.nextInt();
		texto.nextLine();
		System.out.println("Ponto de partida(Cidade inicial): ");
		cidade1 = texto.nextLine();
		System.out.println("Destino final (Cidade final):  ");
		cidade2 = texto.nextLine();
		System.out.println("Distância entre "+cidade1 +" e "+cidade2+" em km: ");
		distancia = texto.nextInt();
		
		
		int gastoLitro = distancia/desempenho;
		double gastoGrana = (combustivel*gastoLitro);
		
		System.out.println(" A quantidade de litros necessária para viagem de "+cidade1+" a "+cidade2+" é de: "+gastoLitro);
		System.out.println(" A quantidade de dinheiro necesário é de: "+gastoGrana);
		
		
		texto.close();
		
		
		
	}

}
