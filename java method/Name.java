public class Name{
    static void hello(String  name){
        System.out.println("Welcome! "+ name);
    }
    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String  [] args){
        int add=sum(50,60);
        System.out.println(add);

        hello("Kishan bhai");

        int result= sum2(200,500,400);
        System.out.println (result);
    }

    static int sum2(int a, int b, int  c){
        int res=a+b+c;
    return res;
    }

}