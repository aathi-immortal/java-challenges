import java.util.Scanner;

public class pascalRecursion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        System.out.println("enter the row value: ");
        value = scan.nextInt();
        pascalTriangle(value);
    }

    public static int[] pascalTriangle(int n) {
        int value;
        int array[] = new int[n + 1];
        array[0] = 1;
        if (n == 1) {
            for (int i = 0; i < n; i++)
                System.out.print(array[i]);
            System.out.println();
            return array;
        }
        int prev[] = pascalTriangle(n - 1);
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1) {
                value = 1;
            } else {

                value = prev[j - 1] + prev[j];
            }

            array[j] = value;

        }
        for (int i = 0; i < n; i++)
            System.out.print(array[i]);
        System.out.println();
        return array;

    }

}
