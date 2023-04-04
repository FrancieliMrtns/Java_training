package Lista_exercicios5matriz;

public class Exercicio1 {
    public static void main(String[] args) {
        int linha = 2;
        int coluna = 3;
        int[][] matriz = new int[linha][coluna];
        int n = 1;
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = n;
                n++;
            }
        }
       
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            
            int soma = 0;
            for (int p = 0; p < linha; p++) {
                for (int j = 0; j < coluna; j++) {
                    soma += matriz[p][j];
                }
            }
            
            System.out.println("Soma dos elementos da matriz: " + soma);
            
           
        }
    }
    
        
    }







