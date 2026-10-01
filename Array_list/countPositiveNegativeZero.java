// coutn Positive Negative and Zero...

import java.util.ArrayList;
public class countPositiveNegativeZero{
    static void countPosiNegzero(ArrayList<Integer>list){
        int Positive=0;
        int Negative=0;
        int Zero=0;
        for(int num:list){
            if(num>0){
            Positive++;
            }
            else if(num<0){
             Negative++;
            }
            else{
             Zero++;
            }
        }
        System.out.print("Array list: ");
        for(int n:list){
            System.out.print(n+" ");
        }
        System.out.println("\nPositive is:"+Positive);
        System.out.println("Negative is:"+Negative);
         System.out.print("Zero is: " +Zero);
    }
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(50);
        list.add(0);
        list.add(-5);
        list.add(80);
        list.add(30);
        list.add(-54);
        list.add(0);
        countPosiNegzero(list);  
    }
}    