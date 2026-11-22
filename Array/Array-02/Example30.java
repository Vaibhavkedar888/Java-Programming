/* Array Case 30: Find Adjacent Values
 
Write a program to find the absolute difference between each element of the array and its next adjacent element.
Store and display all these differences in a new array.
 
Example Input:
Array = [15, 23, 18, 26, 72, 36, 49, 38, 60, 17, 22, 46]
 
Expected Output:
Differences = [8, 5, 8, 46, 36, 13, 11, 22, 43, 5, 24]
*/

public class Example30{
    public static void main(String[] args){
        int A[]={15,23,18,26,72,36,49,38,60,17,22,46};
        int B[]=new int[A.length-1];

        for(int i=0;i<B.length;i++){
            B[i]=A[i]-A[i+1];
            if(B[i]<0){
                B[i]=-B[i];
            }
        }
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
    }
}
