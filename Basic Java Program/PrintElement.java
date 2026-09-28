import java.util.Scanner;
public class PrintElement{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter Array size: ");
    int num=sc.nextInt();

    int arr[]=new int[num];
    
    System.out.print("Enter Array Element: ");
    for(int a=0; a<num; a++)
    arr[a]=sc.nextInt();

    System.out.print("Array Elements: ");
    for(int a=0; a<num; a++)
    System.out.println(arr[a]);
}
}