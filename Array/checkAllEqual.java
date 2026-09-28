class checkAllEqual{
    static boolean checkAllEqual(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[0]){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        int arr[]= {5,5,5,8,5,5};

        System.out.print(checkAllEqual(arr));
    }
}