import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Assume integer input is positive
        System.out.printf("\nEnter a positive integer: \n");
        int inputNum = scan.nextInt();
        int moduloDivNum = 10;
        int total = 0;

        while (inputNum % moduloDivNum != inputNum) {
            moduloDivNum *= 10;
        }

        while (moduloDivNum >= 10) {
            int extractedNum = (inputNum % moduloDivNum) / (moduloDivNum / 10);
            total += extractedNum;
            moduloDivNum /= 10;
        }
        System.out.printf("\nSum of Digits: %d\n", total);
    }
}
