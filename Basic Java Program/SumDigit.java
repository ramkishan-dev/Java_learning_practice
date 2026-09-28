public class SumDigit{
    public static void main(String [] args){

    int num=124555445;
    int sum=0;
    int div;
    while(num!=0){
       /* div=num%10;
        sum+=div; */
        sum+=num%10;
        num/=10;

    }
    System.out.print("Sum is:" + sum);
    }
}