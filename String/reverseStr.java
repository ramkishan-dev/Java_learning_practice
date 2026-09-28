import java.util.*;
public class reverseStr{
    static String reverse(String str){
        String rev=" ";

        for(int i=str.length()-1; i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=ab.nextLine();

        System.out.println("Rvevrse: "+ reverse(str));

    }
}