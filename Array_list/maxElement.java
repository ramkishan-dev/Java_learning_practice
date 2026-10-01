import java.util.ArrayList;
public class maxElement{
    static int findMaxEle(ArrayList<Integer>list){
        int Max=list.get(0);
        for(int i=1; i<list.size();i++){
            if(list.get(i)>Max){
                Max=list.get(i);
            }
        }
        return Max;
    }

    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(41);
        list.add(30);
        list.add(98);
        list.add(541);
        list.add(451);
        list.add(87);
        list.add(90);

         System.out.print("Array List: " );
         for(int num:list){
             System.out.print(num+ " ");
         }
        System.out.print("\nMaximum: "+ findMaxEle(list));

    }
}