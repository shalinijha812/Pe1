import java.util.Scanner;

    public class Series
    {
        public static void main(String[] args)
        {
            int k=1;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter");
            int num=scanner.nextInt();

            /*loop which goes till userinput*/
            for(int i=1;i<=num;i++)
            {
               /*loop that prints the same number in required number of times*/
                for(int j=1;j<=i;j++)
                {
                    System.out.print(k);
                }
                k++;            /*stores the number to be incemented each time in series*/

            }

        }
    }

