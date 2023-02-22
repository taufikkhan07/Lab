package feblab2;
class Shape2{  //parent class
	//constructor of parent class
	Shape2()
	{
		System.out.println("Hello");
	}}
	class Size3 extends Shape2{
		//constructor of the child class
		Size3(){
			//invoke immediate parent class constructor line no 7
			super();
			System.out.println("hi");		
}}

public class Supercons {
	public static void main(String[] args) {
	Size3 obj = new Size3();

	}
}
	


