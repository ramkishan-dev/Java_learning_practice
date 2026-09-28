import java.util.*;
public class reverseHollowDia{
    static void reverseHollowD(int n){
        for(int i=1; i<=n;i++){
            // for(int s=1; s<=n-i; i++){
            //     System.out.print(" ");
            // }
            for(int j=1;j<=n;j++){
                if(i==1||j==1||j==n){
                System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
            System.out.print("Etner the number: ");
            int n=ab.nextInt();
            reverseHollowD(n);
        }
    }