
/**
 * Program to determine the fibonacci series upto n numbers
 * @author pramothinidk
 *
 */
public class FibonacciSeries {
	int[] fibonacciSeries(int n){
//		int fibSeries[] = new int[n];
//		int a,b;
//		fibSeries[0] = a = 0;
//		fibSeries[1] = b = 1;
//		int i = 2;
//		while(i < n){
//			int c = a+b;
//			fibSeries[i] = c;
//			a = b;
//			b = c;
//			i++;
//		}
//		return fibSeries;
		
		
		
		
		
		
		int[] fibseries = new int[n];
		int a = 0,b = 1;
		if(n>=1) fibseries[0] = a;
		if(n>=2) fibseries[1] = b;
		for(int i=2; i<n ; i++){
			fibseries[i] = a+b;
			a = b;
			b = fibseries[i];
		}
		return fibseries;
		
	}

	public static void main(String args[]){
		FibonacciSeries fs = new FibonacciSeries();
		int[] fibSeriesOutput = fs.fibonacciSeries(2);
		for(int i=0 ; i < fibSeriesOutput.length ; i++ ){
			System.out.println(fibSeriesOutput[i]);
		}
	}
}
