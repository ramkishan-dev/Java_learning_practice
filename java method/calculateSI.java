import java.util.*;
public class calculateSI{
    static double calculate(double p, double r,double t){
        return (p*r*t)/100.0;
    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Eter the Princpel: ");
        int a=ab.nextInt();
        System.out.print("Enter the rate: ");
        int b=ab.nextInt();
        System.out.print("Ente the time: ");
        int c=ab.nextInt();
        double result=calculate(a,b,c);
        System.out.print("Simple intrest is:"+ result);
    }
}