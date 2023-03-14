package Lab_09March;
public class PairValue {
		 static void Pair(int inputarray[],int inputnumber) {
			System.out.println("pair of element and their sum:");
			for(int i=0;i<inputarray.length;i++) {
			for(int j=0;j<inputarray.length;j++) {
				  if(inputarray[i]+inputarray[j] == inputnumber) {
					System.out.println(inputarray[i]+" "+inputarray[j]+" ="+inputnumber);
				}
			}
			}
		}
		public static void main(String[] args) {
			Pair(new int[] {2,7,4,-5,11,5,20},15);
			Pair(new int[] {14,-15,9,16,25,45,12,8},30);
			
		}

	}


