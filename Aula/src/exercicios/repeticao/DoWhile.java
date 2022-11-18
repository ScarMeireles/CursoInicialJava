package exercicios.repeticao;
import java.util.Scanner;

public class DoWhile{
    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        do {
                System.out.println("<1> Cadastrar");
                System.out.println("<2> Excluir");
                System.out.println("<3> Sair");
                System.out.println("Digite uma opção: ");
                opcao = ler.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Você escolheu cadastrar");
                        break;
                    case 2:
                        System.out.println("Você escolheu Excluir");
                        break;
                    case 3:
                        break;

                    default:
                        System.out.println("Opção Inválida");
                }
            }
            while (opcao != 3);
        }
    }

