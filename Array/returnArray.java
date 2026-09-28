//Return an Array form a methods: 
public class returnArray{
    static int[] createArray(){
        return new int[]{5,4,8,6,8,6};
    }
    static void printArray(int[] ar  r){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int[] result=createArray();
        printArray(result);
    }
}