public class factorial{
    public static void main(String [] args){
        int fact=1;
        int  num=5;

        for(int a=1; a<=num; a++)
        fact*=a;
        System.out.print("Factorial is: " + fact);
    }
}