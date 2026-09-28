import java.util.Scanner;
public class CountDigitUser{
    public static void main(String [] args){
      Scanner ab=new Scanner(System.in);

      System.out.print("Enter Number of Digits: ");

      int num=ab.nextInt();
      int count=0;
      while(num!=0){
        count++;
        num/=10;
      }
      System.out.print(count);
    }
}