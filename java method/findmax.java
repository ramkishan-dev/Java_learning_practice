public class findmax{
    public static int max(int a, int b){
        if(a>b)
        return a;
        else
        return b;
    }
    public static void main(String [] args){
        int res=max(205, 80);
        System.out.print("max is: "+ res);
    }
}