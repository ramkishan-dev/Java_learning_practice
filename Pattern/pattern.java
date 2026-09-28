import java.util.*;
class pattern{
  static void printPattern(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=ab.nextInt();
        printPattern(n);
    }
}