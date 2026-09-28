class findDuplicate{
    public static void main(String [] args){
        int[] arr={5,6,4,6,8,4,5,8};
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;

                }
            }
        }
    }
}