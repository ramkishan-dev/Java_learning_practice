import java.util.Scanner;
public class CheckEvenOdd{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter any Number then check Even & odd Numbers: ");

        int num=sc.nextInt();
        if(num%2==0)
        System.out.println("Number is Even : ");
        else System.out.print("number is odd: ");
        sc.close();
        }
}