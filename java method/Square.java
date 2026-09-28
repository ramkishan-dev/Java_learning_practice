import java.util.*;
public class Square{
    public static int sqa(int n){
        return n*n;
    }

    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=ab.nextInt();

        int res=sqa(n);
        System.out.print(res);

    }
}