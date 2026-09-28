class vehicle {
    public void move(){
        System.out.println("the vehicle moves");


    }
}
class car extends vehicle{
    public void move(){
        System.out.println("The car moves");

    }
}
public class Test2{
    public static void main(String [] args){
        vehicle ab =new car();
        ab.move();

        ab=new vehicle();
        ab.move();
    }
}