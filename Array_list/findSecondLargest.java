//Find Second Largest Element...

import java.util.*;
public class findSecondLargest{
    static int SecondLargest(ArrayList<Integer>list){
        int largest= Integer.MIN_VALUE;
        int secondLarge= Integer.MIN_VALUE;

        for(int num:list){
            if(num>largest){
                secondLarge=largest;
                largest=num;
            }
            else if(num>secondLarge && num!=largest){
                secondLarge=num;
            }
        }
    return secondLarge;

    }
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(40);
        list.add(15);
        list.add(87);
        list.add(40);
        list.add(30);
        list.add(95);
        System.out.print("Array List: ");
        for(int num:list){
            System.out.print(num+ " ");
        }

        System.out.print("\nSecond Largest: "+ SecondLargest(list));
    }
}