import java.util.Scanner;
public class Factorial{

    static int fact(int n){
        if(n<0){
            System.out.println("Factorial note found");
            return ;
        }
        if(n==0||n==1){
            return 1;
        }else
        return n*fact(n-1);

        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number: ");
            int num=sc.nextInt();

            int result=fact(num);
          if(result!= -1){

            System.out.println("Factorial is : "+ result);
          }
            sc.close();
        }
    }
}