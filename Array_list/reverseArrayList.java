import java.util.*;
public class reverseArrayList{
    static void reverse(ArrayList<Integer>list){
        int start=0;
        int end=list.size()-1;

        while(start<end){
            int temp=list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(45);
        list.add(54);
        list.add(70);
        list.add(90);
       
        System.out.print("Array List: ");
        for(int num:list){
            System.out.print(num+" ");
        }
         reverse(list);
        System.out.print("\nReverse array list: "+ list);
    }
}