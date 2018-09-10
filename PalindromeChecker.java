import java.util.Scanner;
    public class PalindromeChecker {

        public static void main(String[] args)
        {
            int copyInput,lastDigit,sum=0,reverse=0;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter");
            int userInput=scanner.nextInt();
            copyInput=userInput;
            while(copyInput!=0)
            {
                lastDigit=copyInput%10;   /*Calulating the last digit*/
                if(lastDigit%2==0)
                {
                    sum=sum+lastDigit;/*Sum of even numbers*/
                }
                reverse=reverse*10 +lastDigit;/*Reverse of number calculated*/
                copyInput=copyInput/10;
            }
            if(reverse==userInput)
            {
                if(sum>25)
                    System.out.println(userInput+" s palindrome and the sum of even numbers is greater than 25");
                else
                    System.out.println(userInput+" s palindrome and the sum of even numbers is less than 25");
            }
            else
                System.out.println(userInput+" is not a palindrome");

        }
    }

