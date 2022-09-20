public class Freq_of_element {

	public static void main(String[] args) {

		int a[]= {1,2,1,1,1,1};
		
		boolean rs[] = new boolean[a.length];
		
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if (rs[i] == false) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]) {
						rs[j]=true;
						count++;
						}
				}
				System.out.println(a[i]+"=>"+count);	// mistake happens that sop has to be placed inside the for loop 
			}	
		}
	}

}
