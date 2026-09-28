import java.util.*;
public class power{
    static int powerf(int base,int exponent){
        int result=1;
        for(int i=1; i<=exponent;i++){
            result=result*base;
        }
        return result; 
    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System .out.print("Etner the base value: ");
        int base=ab.nextInt();
        System.out.print("Enter the exponent value: ");
        int exponent =ab.nextInt();
        int result=powerf(base,exponent);
        System.out.print(" "+ result);
    }
}