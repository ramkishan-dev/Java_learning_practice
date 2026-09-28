import java.util.*;
public class removeSpaceStr{

    static String removeSpace( String str){
        String result="";
         for (int i = 0; i < str.length(); i++){
            if(str.charAt(i)!= ' '){
                result=result+str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String [] args){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=ab.nextLine();

        System.out.print("Remove Space: "+ removeSpace(str));
           ab.close();
    }
}