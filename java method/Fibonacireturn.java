import java.util.*;
public class Fibonacireturn{
    static int fibonaci(int n){
        int first =0;
        int second=1;
        for(int i=0; i<=n; i++){
           int temp=first+second;
            first=second;
            second=temp;
        }
        return first;

    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Etner the Number: ");
        int n=ab.nextInt();
        int result=fibonaci(n);
        System.out.print("Fibonaci series: " + result);
    }

}