public class checkSorted{
    static boolean checkSorted(int [] arr){
        for(int a=1; a<arr.length; a++){
            if(arr[a]<arr[a-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={10,55,60,80};

        System.out.print(checkSorted(arr));
    }
}