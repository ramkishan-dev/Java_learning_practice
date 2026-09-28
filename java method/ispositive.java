import java.util.*;
public class ispositive{
    static boolean positive(int n){
    return n>0;
    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the nummber: ");
        int a=ab.nextInt();

        if(positive(a))
        System.out.print("is positive:");
        else
        System.out.print("in negative: ");
    }
}