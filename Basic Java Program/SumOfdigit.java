import java.util.Scanner;
public class SumOfdigit{
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num= ab.nextInt();
        int sum=0, digit;
        while(num!=0){
            digit=num%10;
            sum=sum+digit;
            num/=10;
        }
        System.out.print("Sum is :" + sum);
    }
}