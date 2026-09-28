import java.util.Scanner;
public class Palindrom{
    public static void main(String [] args){
    Scanner ab=new Scanner (System.in);
    System.out.print("Enter Number of Digits: ");
    int num=ab.nextInt();
    int rev=0, digit, temp;
    temp=num;
    while(num!=0){
        digit=num%10;
        rev=rev*10+digit;
        num/=10;
    }
    if(temp==rev)
    System.out.print("Number is palindrome");
    else System.out.print("not Palindrome: ");
    }
}