public class palindrome{
    public static void main(String [] args){
    
    int rev =0, num=242;
    int temp=num;

    while(num!=0){
        rev=rev*10+num%10;
        num/=10;
    }
    if(temp==rev)
        System.out.print("is Palindrome");
        else System.out.print("not Palindrome");
    
    }
}