import java.util.*;
public class secondSmallest{
    static int findsecondSmallest(ArrayList<Integer>list){
        int smallest= Integer.MAX_VALUE;
        int secondSm=Integer.MAX_VALUE;

        for(int num:list){
            if(num<smallest){
                secondSm=smallest;
                smallest=num;
            }
            else if(num<secondSm && num!=smallest){
                secondSm=num;
            }
        }
        return secondSm;
    }
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(14);
        list.add(42);
        list.add(52);

        System.out.print("Second Smallest: "+ findsecondSmallest(list));
    }
}