import java.util.Scanner;

public class UnspecifiedInteger{

    public static void main(String[] args) {
        int s=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number;

        while ((number = scanner.nextInt()) != 0)
        {
            s=s+number;
        }
        System.out.print(s);


    }
}

