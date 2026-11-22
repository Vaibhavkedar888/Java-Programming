/* Array Case 19: Replace Each Element with First and Last Digit
 
WAP to replace each elements with their first and last element
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{13,25,64,37,64,27,28,35,65,34}
*/
import java.util.*;
public class Example20{
    public static void main(String[] args) {
      int A[]={123,235,6754,3257,64,2367,288,35,645,374};
      System.out.print("Output: ");
       for(int i=0;i<A.length;i++){
            int f=A[i];
            int last=f%10;
            while (f>=10){
                f=f/10;
            }
            A[i]=f*10+last;
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
