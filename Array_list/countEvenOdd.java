//Count Even and Odd nubmers.. 

import java.util.ArrayList;
public class countEvenOdd{
    static void countEvenOdd(ArrayList<Integer>list){

        int even=0;
        int odd=0;
        for(int num:list){
            if(num%2==0){
                even++;
            } else 
            odd++;
        }
        System.out.println("\nCount Even: "+ even);
        System.out.print("Count Odd: "+ odd);
    }

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(54);
        list.add(15);
        list.add(19);
        list.add(28);
        list.add(41);
        list.add(62);
        list.add(87);

        System.out.print("Array List: ");
        for(int n:list){
            System.out.print(n+" ");
        }

        countEvenOdd(list);
    }
}