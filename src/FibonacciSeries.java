
/**
 * Program to determine the fibonacci series upto n numbers
 * @author pramothinidk
 *
 */
public class FibonacciSeries {
	int[] fibonacciSeries(int n){
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
