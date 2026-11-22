/* Array Case 25: Reverse Each Element

 WAP to reverse each element from array

 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output:{321,532,4576,7523,46,7632,882,53,546,473,65}
*/
import java.util.*;
public class Example25{
    public static void main(String[] args) {
      int A[]={123,235,6754,3257,64,2367,288,35,645,374,56};
      System.out.print("Output: ");
       for(int i=0;i<A.length;i++){
            int n=A[i];
            int cnt=0; int r;

            while(n>0){
                 r=n%10;                
                cnt++;
                n=n/10;
                System.out.print(r);
            }
            System.out.print(" ");
        }
    }
}
