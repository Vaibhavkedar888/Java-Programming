package p1;

import static com.mylib.MathUtils.add;
import static com.mylib.MathUtils.subtract;
import static com.mylib.MathUtils.multiply;
import static com.mylib.MathUtils.divide;

 public class Main{
 	public static void main(String[] args) {
 		int num1=11;
 		int num2=5;
 		System.out.println(add(num1,num2));
 		System.out.println(subtract(num1,num2));
 		System.out.println(multiply(num1,num2));
 		System.out.println(divide(num1,num2));
 		
 	}
 }