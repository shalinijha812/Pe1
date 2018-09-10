import java.util.Scanner;

    public class StringInputRepeater{

        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a string");
            String nextScannedLine=scanner.nextLine();
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=scanner2.nextInt();
            System.out.print(nextScannedLine);
            /**/
            char[] ch=nextScannedLine.toCharArray();
            int len = ch.length;
            for(int i=0;i<num;i++) {
                for (int j = (len - num); j <len; j++) {

                    System.out.print(ch[j]);
                }
            }

        }
    }
