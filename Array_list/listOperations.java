import java.util.ArrayList;
public class listOperations{
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();

        list.add(15);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(55);
        System.out.println("List: "+ list);

        list.add(1, 10); //Add to Specific index..
        System.out.println("After Insert: "+ list);

        list.set(0,5); //Update Elements...
        System.out.println("After Update: "+ list);

        list.remove(3); //remove for indexing
        System.out.println("After remove: "+ list);

        list.remove(Integer.valueOf(40)); //Remove Value..
        System.out.println("After Remove: "+ list);

        //Access Element...
        System.out.println("Access Ele : "+list.get(2));

        System.out.println("Check Element: "+ list.contains(40));
        //size of list..
        System.out.print("list size: "+ list.size());


    }
}    