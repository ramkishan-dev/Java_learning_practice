/*WAP to Segregate all 0's and i's in an array such that all 0's appear before all 1's..
---use the two-pointer technique---*/
public class Segregate0and1{
    static void Segregate(int[] arr){
        int a=0;
        int b=arr.length-1;
        while(a<b){
            if(arr[a]==0){
             a++;
            }
            else if(arr[b]==1) {
            b--;
            }
           //(arr[a]==1 && arr[b]==0)
           else{
                arr[a]=0;
                arr[b]=1;
                a++;
                b--;
            }
        }
    }
    public static void main(String [] args){
        int[] arr= {1,1,0,1,0,1,0, 1,1,0};
        Segregate(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}