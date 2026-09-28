import java.util.Scanner;
public class CheckDivisibleNum{
    public static void main(){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter nubmer: ");
        int num =sc.nextInt();

        if(num%5==0)
        System.out.println("its divisible by 5");
        else System.out.print("not divisible by 5");
        sc.close();
    }
}