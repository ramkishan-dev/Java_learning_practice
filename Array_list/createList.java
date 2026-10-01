//Create an Array list and add numbers....

import java.util.ArrayList;
public class createList{
    static ArrayList<Integer>createList(){
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=1; i<=10; i++){
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args){
        System.out.print(createList());
    }
}