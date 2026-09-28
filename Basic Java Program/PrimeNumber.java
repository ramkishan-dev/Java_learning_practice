public class PrimeNumber{
    public static void main(String [] args){
        int num=71;
        boolean isPrime=true;
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        System.out.print("is Prime numbers");
        else
        System.out.print("NOt prime");
    }
}