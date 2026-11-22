/* Array Case 27: Append Sum of Digits to Each Element 

WAP to add sum of digit of each elements at last of elements

Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56};
Output:{1236,23510,675422,325717,6410,236718,28818,358,64515,37411,5611};
*/
public class Example27{
  public static void main(String[] args){
	    int A[]={123,235,6754,3257,64,2367,288,35,645,374,56};
	    for(int i=0;i<A.length;i++){
	     int n=A[i];
	     int sum=0;
	     int count=10;

	     while(n>0){
	       int r=n%10;
	       sum=sum+r;
	       n=n/10;
	     }

	     int temp=sum;

	     while(temp>=10){
	      count=count*10;
	      temp=temp/10;
	     }

	      A[i]=A[i]*count+sum;
	    }

	    for(int i=0;i<A.length;i++){
	      System.out.print(A[i]+" ");
	    }
  }
}
