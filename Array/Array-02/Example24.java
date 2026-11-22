/* Array Case 24: Replace Each Element with Average of Digits

 WAP to replace each elements with their avg of digit

 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output: {2, 3, 5, 4, 5, 4, 6, 4, 5, 4, 5}
*/
import java.util.*;
public class Example24{
    public static void main(String[] args) {
      int A[]={123,235,6754,3257,64,2367,288,35,645,374};
      System.out.print("Output: ");
       for(int i=0;i<A.length;i++){
            int n=A[i];
            int sum=0;
            int cnt=0;

            while(n>0){
                int r=n%10;
                sum=sum+r;
                cnt++;
                n=n/10;
            }
            A[i]=sum/cnt;
        }

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
