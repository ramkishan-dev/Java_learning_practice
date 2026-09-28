
public class practiceMethod{
    public static void shravan(){
        karan();
        System.out.print("Kishan ");
    }
    public static void karan(){
        System.out.print("Rahul ");
    }
    public static void riyanshi(){
        karan();
        shravan();
        System.out.print("Balvant ");
        shravan();
    }
    public static void main(String [] args){
        riyanshi();
        System.out.print(" "+sum(20 ,60));

    }
    public static int sum( int a,int b){
        int sum=a+b;
        return sum;
    }
}