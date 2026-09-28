import java.util.*;
public class countNo{
    static int countDigit(long n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the Digit: ");
        long n=ab.nextLong();
        int result=countDigit(n);

        System.out.print(" "+ result);
    }
}