/* Array Case 23: Replace Each Element with Sum of Digits

 WAP to replace each elements with their sum of digit

 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output: {6, 10, 22, 17, 10, 18, 18, 8, 15, 14, 11}
*/
import java.util.*;
public class Example23{
    public static void main(String[] args) {
      int A[]={123,235,6754,3257,64,2367,288,35,645,374};
      System.out.print("Output: ");
       for(int i=0;i<A.length;i++){
            int n=A[i];
            int sum=0;

            while(n>0){
                int r=n%10;
                sum=sum+r;
                n=n/10;
            }
            A[i]=sum;
        }

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
