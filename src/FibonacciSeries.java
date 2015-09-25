
/**
 * Program to determine the fibonacci series upto n numbers
 * @author pramothinidk
 *
 */
public class FibonacciSeries {

	int[] fibonacciSeries(int n){
		int fibSeries[] = new int[n];
		int a,b;
		fibSeries[0] = a = 0;
		fibSeries[1] = b = 1;
		int i = 2;
		while(i < n){
			int c = a+b;
			fibSeries[i] = c;
			a = b;
			b = c;
			i++;
		}
		return fibSeries;
	}

	public static void main(String args[]){
		FibonacciSeries fs = new FibonacciSeries();
		int[] fibSeriesOutput = fs.fibonacciSeries(10);
		for(int i=0 ; i < fibSeriesOutput.length ; i++ ){
			System.out.println(fibSeriesOutput[i]);
		}
	}
}
