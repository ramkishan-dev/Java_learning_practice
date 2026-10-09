import java.util.*;
public class swapElements{
    static void swap(ArrayList<Integer> list, int i, int j) {
        int temp=list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args){
        ArrayList<Integer>list= new ArrayList<>();

        list.add(20);
        list.add(50);
        list.add(10);
        list.add(45);
        list.add(42);
        list.add(53);
        System.out.print("Array list: "+list);
        System.out.print("\n Index is  : ");
        for (int i = 0; i < list.size(); i++) {
            // System.out.print("Index " + i + " = " + list.get(i));
            System.out.print(i+"   ");
        }

        swap(list,1,5);
        System.out.print("\nSwap List:  " +list);
    }
}