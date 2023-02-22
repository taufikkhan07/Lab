package Method;
import java.util.*;
class Arithmetic {
	int sum;
	int add(int x,int y) {
		sum=x+y;
		return sum;
	}

}
class Adderr extends Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		Adderr ad=new Adderr();
		int result=ad.add(a, b);
		System.out.println("The sum of "+a+" & "+b+" is: "+result);
	}
}
