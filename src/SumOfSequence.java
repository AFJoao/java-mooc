import java.util.Scanner;
public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número:");
        int numero = Integer.valueOf(scanner.nextLine());
        int soma = 0;
        for (int i = 0; i <= numero; i++) {
            soma += i;
        }
        System.out.println("The sum is " + soma);
    }
}
