
class abc{
    public static void main(String[] args){
        int n=7;
        for(int j=1; j<=n; j++){
            for(int i=1; i<=j; i++){
                if((j+i)%2==0)
                System.out.print(1+"");
                else
                System.out.print(0+"");
            }
            System.out.println();
        }         
    }
}