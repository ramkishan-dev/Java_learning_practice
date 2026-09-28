import java.util.Scanner;
public class UserInput{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();
        System.out.println("Number is: ");

        for(int b=0; b<=a; b++)
        System.out.println( "   " +b);


    }
}