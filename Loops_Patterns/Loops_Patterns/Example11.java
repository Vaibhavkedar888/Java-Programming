/* 
1.Rectangle  
	* * * * * * 
	* * * * * * 
	* * * * * *
*/
import java.util.*;

class Example11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.print("\n 1.Rectangle  ");
	System.out.print("Enter the rows and columns: ");
	int rows=sc.nextInt();
	int cols=sc.nextInt();

    System.out.println();
    for(int i=1;i<=rows;i++)
      {
        for(int j=1;j<=cols;j++)
        {
          System.out.print("* ");
        }System.out.print("\n");
      }
	}
} 