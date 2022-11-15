package exercicios.repeticao;

public class mila1x5 {
    public static void main(String[] args) {
        int i, count = 0;
        for (i = 1000; i > 0; i--) {
            if (i%5==0) {
                System.out.print(i + "\t");
                count ++;
            }
        }
        System.out.println("\n" + count);
    }
}
