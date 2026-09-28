import java.util.*;
public class hollowDiamond{
    static void hollowD(int n){
        for(int i=1; i<=n;i++){
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){
                if(j==1||j==(2*i)-1){
                System.out.print(i+"");
                }
                else System.out.print(" ");

            }
            System.out.println();
        }

        for(int i=n-1; i>=1;i--){
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1;j++){
                if(j==1||j==(2*i)-1){
                System.out.print(i+"");
                }
                else System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=ab.nextInt();

        hollowD(n);
    }
}