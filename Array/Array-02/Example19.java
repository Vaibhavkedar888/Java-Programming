/* Array Case 18: Replace Each Element with First Digit

WAP to replace each elements with their first digit of element

Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
Output:{1,2,6,3,6,2,2,3,6,3}
*/
import java.util.*;
public class Example19 {
    public static void main(String[] args) {
      int A[]={123,235,6754,3257,64,2367,288,35,645,374};
      System.out.print("Output: ");
      for(int i=0;i<A.length;i++){
      //int n=A[i];
        while(A[i]>9){
          A[i]=A[i]/10;
        }
        System.out.print(" "+A[i]);
      }
    }
}
