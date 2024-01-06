import java.util.Scanner;

public class Recursive {

    public static void printNumbers(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
            return;
        }

        if (a < b) {
            System.out.print(a + " ");
            printNumbers(a + 1, b);
        } else {
            System.out.print(a + " ");
            printNumbers(a - 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int A = scanner.nextInt();

        System.out.print("Enter the value of B: ");
        int B = scanner.nextInt();

        System.out.println("Numbers from " + A + " to " + B + ":");
        printNumbers(A, B);

        scanner.close();
    }
}
