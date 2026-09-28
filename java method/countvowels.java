import java.util.*;
    public class countvowels{
        static int countVowel(String str){
            int count=0;
            for(int i=0; i<str.length(); i++){
                char ch = Character.toLowerCase(str.charAt(i));
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o' || ch=='u'){
                    count++;
                }
            }
            return count;
        }

        public static void main(String [] args){
            Scanner ab=new Scanner(System.in);
            System.out.print("Enter the string: ");
            String str=ab.nextLine();

            System.out.print("Counts vowels: "+ countVowel(str));

        }

    }
