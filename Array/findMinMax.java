public class findMinMax{
    static void findMinMax(int[] arr){
        int Max=arr[0];
        int Min=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
            if(arr[i]<Min){
                Min=arr[i];
            }
        }
        System.out.println("Max is: "+ Max);
        System.out.print("Min is: "+ Min);
    }

    public static void main(String[] args){
        int[] arr={5,8,80,4,55,4,465,56,45};

        findMinMax(arr);
    }
}