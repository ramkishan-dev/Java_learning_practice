import java.util.*;
public class checkage{
    static String isvalidage( int age){
        if(age<0 || age>135)
        return " not allowed age negative & more then 135. please enter valid age:";
        else if(age>=18)
        return "is valid age: Eligibale to vot. ";
        else
        return "Minor age- not eligible to vote: ";
    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Etner the age : ");
        int n=ab.nextInt();
         System.out.print(" "+ isvalidage(n));
    }
}