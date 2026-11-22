/* Array Case 28: Case Study (Divisible by 4 and/or 5)

WAP to solve following case study
consider black number, which is divisible by 4.
consider white number, which is divisible by 5.
consider grey number, which is both black & white
replace black number with -1.
replace white number with -2.
replace grey number with -3. 
Example Input:
input: {10,14,24,12,18,26,20,23,22,15,26}

Expected Output:
output:{-2,14,-1,-1,18,26,-3,23,22,-2,26}
*/
import java.util.*;
public class Example28{
    public static void main(String[] args) {
      int A[]={10,14,24,12,18,26,20,23,22,15,26};
      System.out.print("Output: ");
       for(int i=0;i<A.length;i++){
	            if(A[i]%4==0 && A[i]%5==0){
	            	A[i]=-3;
	            }
	            else if(A[i]%4==0){
	            	A[i]=-1;
	            }
	            else if(A[i]%5==0){
	            	A[i]=-2;
	            }       
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
