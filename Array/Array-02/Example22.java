/* Array Case 21: Move Last Digit to First (Each Element)
 
WAP to shift last digit to first from each elements
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{312,523,4675,7325,46,7236,828,53,564,437}
*/
import java.util.*;
public class Example22{
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
            int last=A[i]%10;
            int rem=A[i]/10;
            A[i]=count*last+rem;
        }

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}