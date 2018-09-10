import java.util.Scanner;

    public class OriginalNumberGuess
    {

        public static void main(String[] args)
        {
            int tn=0;
            int userInput;

            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Guess a number between 1 t0 50");
                 userInput = scanner.nextInt();
                if ( userInput>=1 &&  userInput<=50)
                {

                    tn = 46;

                    if (userInput<= tn)
                        System.out.println(" Number guessed is less than original number");
                    else if (userInput >= tn)
                        System.out.println(" Number guessed is more than original number");
                    else if (userInput == tn)
                        System.out.println(" Number guessed matched with the original number");
                }
                else
                    System.out.println("invalid entry");
            }
            while(userInput!=tn);
        }
    }

