//Check Whether ArrayList is Sorted...

import java.util.ArrayList;
public class listSorted{
    static boolean isSorted(ArrayList<Integer>list){
        for(int i=1; i<list.size(); i++){
            if(list.get(i)<list.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(5);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(55);
        System.out.print("Array List: ");
        for(int num:list){
            System.out.print(num +" ");
        }
        
        System.out.print("\nList is sorted: "+isSorted(list));
    }
}