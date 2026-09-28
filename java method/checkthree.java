public class checkthree{
    public static int findthree( int a,int b,int c){
        if(a>=b && a>=c)
        return a;
        else if(b>=a && b>=c)
        return b;
        else
        return c;
    }
    public static void main(String[] args){
        System.out.print("max is: "+ findthree(55,78,484));
    }

}