
public class Replace_the_array_elements_WithTheSumOfDigits {

	public static void main(String[] args) {
		
		int a[]= {11,55,84,74,63};
		
			int result[]=sumOfDigitsOfArray(a);
			
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}

	}

	 static int[] sumOfDigitsOfArray(int[] a) {

		 for (int i = 0; i < a.length; i++) {
			a[i]=sumOfDigits(a[i]);
		}
		return a;
	}

	 static int sumOfDigits(int i) {
		 int sum=0;
		 
		 do {
			 int r=i%10;
			 sum=sum+r;
			 i=i/10;
		 			}while(i!=0);
		 
		 return sum;
		 }
	}

