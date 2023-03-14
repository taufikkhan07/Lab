package Lab_09March;
public class OddPosition {
	public static void main(String[] args) {
		// initialize the value
		int[]arr=new int[]{1,2,3,4,5};
		System.out.println("present on odd posotion");
		for(int i =0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
				}

}

