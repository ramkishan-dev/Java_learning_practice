import java.util.*;
public class isPalindrom{
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Etner the Numbers: ");
        int num=ab.nextInt();
        int rev=0;
        int org=num;
        while(num!=0){
            int y=num%10;
            rev=rev*10+y;
            num=num/10;

        }
        if(org==rev){
            System.out.print("is Palindrom ");
        } else 
        System.out.print("not palindrom");


    }
}