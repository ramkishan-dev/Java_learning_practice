// Find the comman Elements:
import java.util.*;

class commanElements{
       static ArrayList<Integer> commanEle(int[] a, int[] b) {
        int i=0, j=0;

        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length && j<b.length){

            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
           return ans;
    }
 

     public static void main(String[] args) {

        int a[] = {2, 5, 4, 8, 6};
        int b[] = {3, 6, 4, 2, 7};

        ArrayList<Integer> ans = commanEle(a, b);

        System.out.print(ans);
    }
}