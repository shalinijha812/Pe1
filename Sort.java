import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        int x[];
        int temp, k = 0, s = 0;
        x = new int[20];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num");
        int num = scanner.nextInt();
        int a = num;
        /*Calculate number of digits in a number */
        while (a != 0) {
            x[i] = a % 10;
            i = i + 1;
            a = a / 10;
        }
        k = i - 1;/*pointer stops at one space extra so 1 deducted*/

       /*bubble sort*/
        for (i = 0; i <= k; i++) {
            for (int j = i + 1; j <= k; j++) {
                if (x[i] < x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.print("Sorted number is:");

//        check for even number

        for (i = 0; i <= k; i++) {
            if (x[i] % 2 == 0)
                s = s + x[i];

            System.out.print(x[i]);
        }
        System.out.println(" ");
        System.out.println("Sum of even numbers is");
        System.out.println(s);
        if (s > 15)
            System.out.println("True");
        else
            System.out.println("False");

    }
}

