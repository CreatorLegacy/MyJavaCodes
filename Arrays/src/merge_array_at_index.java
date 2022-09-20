
public class merge_array_at_index {

	public static void main(String[] args) {
		int a[]= {10,20,30,70,80};
		int b[]= {40,50,60};
		int in=3;
		
		int result[]=mergeArrayAtindex(a,b,in);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);	
		}
		
		
	}

	 static int[] mergeArrayAtindex(int[] a, int[] b, int in) {
		 if(in<0||in>a.length)
			 return a;
		 
		 
		 else {
			 int result[]=new int[a.length+b.length];
			 
			 for (int i = 0; i < b.length; i++) {
				 result[in+i]=b[i];}
				 
			 for (int j = 0; j < a.length; j++) {
					if(j<in)
						result[j]=a[j];
					else
						result[j+b.length]=a[j];
				}
			return result; 	
		}	 
		 
	}

}
