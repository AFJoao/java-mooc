import java.util.Scanner;
public class NumbersAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemps = 0;
        int sum = 0;
        while (true){
            System.out.println("Give a number (end with 0): ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            attemps += 1;
            sum += number;
        }
        System.out.println("Number of numbers: " + attemps);
        System.out.println("Sum of the numbers: " + sum);
    }
}
