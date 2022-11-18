package exercicios.vetores;
import java.util.Scanner;
public class vetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float somaIdade = 0;
        int[] idades = new int [10];
        for (int i = 0; i < 10; i++){
            System.out.println("Digite uma idade: ");
            idades[i] = ler.nextInt();
            somaIdade += idades[i];
        }
        System.out.println("A média das idades é: " + somaIdade/10);
        for (int i = 0; i < 10; i++) {
            System.out.print(idades[i] + "\t");
        }
    }
}