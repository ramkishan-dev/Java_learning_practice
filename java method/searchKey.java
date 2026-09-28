public class searchKey{
    static boolean searchE(int[] arr, int key){

        for(int i=0; i<arr.length; i++){
            if (arr[i]==key)
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        int [] arr={5,6,4,8,51,21,15};
        int key=501;
        
        if(searchE(arr,key))
             System.out.print("is found! ");
            else 
              System.out.print("is not found! ");    
    }
}