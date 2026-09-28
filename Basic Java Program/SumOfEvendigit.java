import java.util.Scanner;
public class SumOfEvendigit{
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the numbers of Digit: ");

        int num=ab.nextInt();
        int sum=0, digit;

        while(num!=0){
            digit=num%10;
            if(digit%2==0)
            sum+=digit;
           
            num/=10;
        }
         System.out.print("Sum is: "+ sum);

    }
}