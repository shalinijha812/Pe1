import java.util.Scanner;

    public class Tomjerry
    {

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter");
            int userInput = scanner.nextInt();
            if (userInput >= 20 && userInput <= 30)
            {
                if (userInput % 2 == 0)
                {
                    System.out.println("Jerry");

                }
                else
                    System.out.println("Tom");
            }
        }
    }


