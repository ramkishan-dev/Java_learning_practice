class Animal{
    void sound (){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog braks");

    }
}
class cat extends Animal{
    void sound(){
        System.out.println("Cat mmeows");
    }
}

public class DynamicMethod{
    public static void main(String [] args){
        Animal obj;
        obj= new Dog();
        obj.sound();

        obj=new cat();
        obj.sound();
        
        obj= new Animal();
        obj.sound();
            }
}