import java.util.Scanner;

    public class Vowcons {

        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a String");
            String userInput=scanner.nextLine();
            for(int i=0;i < userInput.length();i++)
            {
                if ((userInput.charAt(i)=='A') ||(userInput.charAt(i)=='E')
                        ||(userInput.charAt(i)=='I') ||(userInput.charAt(i)=='O')
                        ||(userInput.charAt(i)=='U') ||(userInput.charAt(i)=='a')
                        ||(userInput.charAt(i)=='e') ||(userInput.charAt(i)=='i')
                        ||(userInput.charAt(i)=='o') ||(userInput.charAt(i)=='u'))
                {
                    System.out.print("Vowel ");
                }
                else
                    System.out.print("Consonant ");
            }
        }
    }

