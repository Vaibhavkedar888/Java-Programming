/* Array Case 29: Case Study (Divisible by 6 / Contains 6)
WAP to solve following case study
consider black number, which is divisible by 6.
Consider the white number, which contains 6.
consider grey number, which is both black & white
replace black number with -1.
replace white number with -2.
replace the grey number with -3.
Example Input:
input: {15,23,18,26,72,36,49,38,60,17,22,46}
 
Expected Output:
output:{15,23,-1,-2,-1,-3,49,38,-3,17,22,-2}
 */
import java.util.Scanner;
public class Example29{
    public static void main(String[] args){
        int A[]={15,23,18,26,72,36,49,38,60,17,22,46};
        System.out.print("Output: ");

        for(int i=0;i<A.length;i++){
            int n=A[i];
            int b=0;
            int w=0;
            if(n%6==0){
                b=1;
            }
            while(n>0){
                int r=n%10;
                if(r==6){
                    w=1;
                }
                n=n/10;
            }
            if(b==1 && w==1){
                A[i]=-3;
            }
            else if(b==1){
                A[i]=-1;
            }
            else if(w==1){
                A[i]=-2;
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
