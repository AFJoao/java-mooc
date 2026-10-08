import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número:");
        int numero = Integer.valueOf(scanner.nextLine());
        int fatorial = numero;
        if (numero == 0) {
            System.out.println("The factorial is 1");
        } else { for (int i = 1; i < numero; i++) {
            fatorial = fatorial * i;
            }
            System.out.println("The factorial is " + fatorial);
        }

    }
}
