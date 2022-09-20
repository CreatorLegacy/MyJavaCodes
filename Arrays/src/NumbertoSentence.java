import java.util.Scanner;

public class NumbertoSentence {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();

		
		nw(n/10000000,"Corer");
		nw((n/100000)%100,"Lakhs");
		nw((n/1000)%100,"Thousand");
		nw((n/100)%10,"Hundred");
		nw(n%100,"");
	}

	 static void nw(int i, String x) {
		 
		 String []one= {"","One ","Two ","Three ","Four ","Five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen "
		 		+ "seventeen ","eighteen ","nineteen "};
		 String []two= {"","","Twenty-","Thirty-","Forty-","Fifty-","Sixty-","Seventy-","Eighty-","Ninty-"};
		 
		 if(i<20)
			 System.out.print(one[i]);
		 else
			 System.out.print(two[i/10]+one[i%10]);
		 
		 if(i!=0)
		 System.out.print(x+"  ");
	}

}
