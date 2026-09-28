public class ReverseNumbers{
    public static void main(String [] args){
        int rev=0; 
        int num = 12454; 
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;

        }
        System.out.print(rev);
    }
}