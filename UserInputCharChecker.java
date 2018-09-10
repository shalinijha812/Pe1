import java.util.Scanner;

public class UserInputCharChecker
{
    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character");
        char inputChar = scanner.next().charAt(0);

        if (inputChar >= 48 && inputChar <= 57)
        {
            System.out.println("Special character");
        }
        else if (inputChar >= 65 && inputChar <= 96)
        {
            System.out.println("Capital letter");
        }
        else if (inputChar >= 97 && inputChar <= 123)
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("digit");
        }

    }
}









