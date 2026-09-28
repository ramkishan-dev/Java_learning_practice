import java.util.*;
public class checkvote{
    static boolean isEligibale(int age){
        return age>=18 && age<=135;
    }
    static boolean isvalid(int age){
        return age>0 && age<=135;
    }
    static boolean checkzero(int age){
        return age==0;
    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int n=ab.nextInt();
        if(checkzero (n))
        System.out.print("Please Enther valid age not allowed zero age:");
        else if(!isvalid (n))
        System.out.print("Not allowed negative age plese Enter the valid age: (1-135)");

        else if(isEligibale(n))
        System.out.print(" Eligibale to vate: ");
        else
        System.out.print("not Eligibale to vote: ");

    }
}