/* Array Case 26: Replace Each Element with Highest Digit
 
 WAP to replace highest digit from each elements
 
 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
output:{3, 5, 7, 7, 6, 7, 8, 5, 6, 7, 6}
*/
import java.util.*;
public class Example26{
    public static void main(String[] args) {
      int A[]={123,235,6754,3257,64,2367,288,35,645,374,56};
      System.out.print("Output: ");
       for(int i=0;i<A.length;i++){
            int n=A[i];
            int max=0; int r;

            while(n>0){
                 r=n%10; 
                 if(r>max){
                 	max=r;
                 }               
                n=n/10;                
            }
            A[i]=max;
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
