import java.util.Scanner;
public class RepeatingBreakingRemembering {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give numbers:");
    int soma = 0;
    int quantidadeNumeros = 0;
    int even = 0;
    int odd = 0;
    while (true) {
        int numero = Integer.valueOf(scanner.nextLine());
        if (numero == -1) {
            break;
        } else {
            soma += numero;
            quantidadeNumeros += 1;
            if (numero % 2 == 0){
                even += 1;
            } else odd += 1;
        }
    }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + soma);
        System.out.println("Numbers: " + quantidadeNumeros);
        System.out.println("Average: " + ((double)soma / quantidadeNumeros));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
