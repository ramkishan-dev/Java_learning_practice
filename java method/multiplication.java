public class multiplication{
    public static void multi(int a, int b){
        int multip=a*b;
        System.out.print(multip);
    }

    public static int multi2(int x, int y, int z){
        return x*y*z;
    }

    public static void main(String [] args){
        multi(20,60);

        System.out.print(" "+ multi2(20,5,6));


    }
}