import java.util.*;
public class Fibonaci{
    static void fibo(int n){
        int first=0;
        int second=1;
        for(int i=0; i<=n; i++){
            System.out.print(first+" ");
            int temp=first+second;
            first=second;
            second=temp;
        }

    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Etner the Numbers: ");
        int n=ab.nextInt();
        fibo(n);
        
    }
}