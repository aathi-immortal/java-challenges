import java.util.Scanner;

public class pascalIteration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        System.out.println("enter the row value: ");
        value = scan.nextInt();
        pascal(value);

    }

    public static void pascal(int n) {
        int prev[] = new int[n + 1];
        int first = 0;
        int value;

        for (int i = 1; i < n + 1; i++) {

            first = 0;
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (prev[0] == 0) {

                    value = 1;
                } else if (j == i - 1) {
                    value = first + 0;
                } else {
                    value = first + prev[j];
                    first = prev[j];
                }
                prev[j] = value;
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}