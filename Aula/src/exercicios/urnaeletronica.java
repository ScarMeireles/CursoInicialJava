package exercicios;
import java.util.Scanner;
public class urnaeletronica {
    public static void main(String[] args) {
        int opcao, votoA=0, votoB=0;
        Scanner ler = new Scanner (System.in);
        do {
            System.out.println("1 - Voto no Candidato A");
            System.out.println("2 - Voto no Candidato B");
            System.out.println("3 - Apurar Resultado");
            System.out.println("4 - Sair");

            System.out.println("Escolha uma opção:");
            opcao = ler.nextInt();


            switch(opcao){
                case 1:
                    votoA++;
                    System.out.println("Voto contabilizado!");
                    break;

                case 2:
                    votoB++;
                    System.out.println("Voto contabilizado!");
                    break;

                case 3:
                    if(votoA > votoB)
                        System.out.println("Candidato A venceu com " + votoA + " votos");
                    else if(votoA < votoB)
                        System.out.println("Candidato B venceu com " + votoB + " votos");
                    else
                        System.out.println("Empate!");
                    break;

                case 4:
                    System.out.println("Candidato A : " + votoA);
                    System.out.println("Candidato B : " + votoB);
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;

            }

        }while (opcao != 4);
    }
}
