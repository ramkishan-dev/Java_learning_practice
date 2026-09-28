
import java.util.Scanner;
public class ArmstrongUser{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num=sc.nextInt();
        int sum=0, digit, temp=num;

        while(num!=0){
            digit=num%10;
            sum=sum+digit*digit*digit;

            num/=10;
        }
        if(sum==temp)
        System.out.print("is ArmStrong");
        else System.out.print("not ArmStrong");
    }
}