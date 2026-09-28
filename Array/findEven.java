class findEven{
    static int Even(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count; 
    }
    public static void main(String[] args){
        int[] arr={5,4,8,6,4,11,82,5,14,20};
        int result=Even(arr);
        System.out.print("count is:"+ result);
    }

}