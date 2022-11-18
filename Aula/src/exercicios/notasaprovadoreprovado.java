package exercicios;

import java.util.Scanner;
public class notasaprovadoreprovado {
    public static void main(String[] args) {
        float nota;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma nota");
        nota=ler.nextFloat();
        if(nota<0 || nota>100)
            System.out.println("Nota Inválida");
        else if(nota<40)
            System.out.println("Reprovado");
        else if (nota<60) {
            System.out.println("Recuperação");
        }
        else
            System.out.println("Aprovado");

    }
}
