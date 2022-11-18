package exercicios;
import java.util.Scanner;
public class cigarros {
    static Scanner ler =  new Scanner (System.in);
    public static void main(String[] args) {
        int ano=0, numCigarro=0, totalCigarro=0;
        double preco, totalPreco;
        System.out.println("Digite o número de anos: ");
        ano = ler.nextInt();

        System.out.println("número de cigarros por dia: ");
        numCigarro = ler.nextInt();

        System.out.println("Preço médio da carteira de cigarros:" );
        preco = ler.nextDouble();

        totalCigarro = ano*365*numCigarro;
        totalPreco = (preco/20)*totalCigarro;

        System.out.println("Total de cigarros fumados: " + totalCigarro);
        System.out.println("Valor gasto com cigarros: " + totalPreco);
    }
}
