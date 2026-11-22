/* Array Case 20: Move First Digit to Last
 
WAP to replace first digit at last of element.
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{231,352,7546,2573,46,3672,882,53,456,743}
*/
import java.util.*;
public class Example21{
    public static void main(String[] args) {
      int A[]={123,235,6754,3257,64,2367,288,35,645,374};
      System.out.print("Output: ");
       for(int i=0;i<A.length;i++){
            int n=A[i];
            int count=1;

            while(n>=10){
                n=n/10;
                count=count*10;
            }
            int last=A[i]%count;
            A[i]=n+last*10;
        }

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}