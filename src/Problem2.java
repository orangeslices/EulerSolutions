
/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 {

	
	public static void main(String[] args) {
		
		//F(n) =(phi^n - (-phi)^(-n))/√5
		
		double golden = 1.61803398875;
		double root5 = Math.pow(5, 0.5);
		int counter =1;
		double val = 1;
		double sum =0;
		while(val <= 4000000)
		{
			if(val%2==0)sum+=val;
			val = Math.round((Math.pow(golden, counter)-Math.pow(-golden,-counter ))/root5);
			counter++;
		}
		System.out.println((int)sum);
		System.out.println(ans());
	}
	
	public static long ans()
	{
		int a = 1;
		int b = 1;
		int c = a+b;
		long sum =0;
		while(c <= 4000000)
		{
			if(c%2 == 0) sum+=c;
			a = b;
			b = c;
			c = a+b;
		}
		return sum;
	}
}
