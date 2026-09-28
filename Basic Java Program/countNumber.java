public class countNumber{
    public static void main(String[] args){
    int num=124556;
    int count=0;

    while(num!=0){
        count++;
        num/=10;
     
    }

    System.out.print("Count is: " + count);
    }
}