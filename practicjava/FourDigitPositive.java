import java.util.Scanner;
public class FourDigitPositive{
   public static void main(String args []){
    Scanner ab = new Scanner(System.in);

    System.out.print("Enter Number: ");
    int n=ab.nextInt();
    if(n>999 && n<10000)
    System.out.println("its four digit: Numbers: ");
    else  System.out.print("not four digit nubmers: ");
    ab.close();

   }
}