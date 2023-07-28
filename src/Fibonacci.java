import java.util.Scanner;
	public class Fibonacci 
	{
		public static void main(String[] args) 
		{
			 Scanner console = new Scanner(System.in);
		        int num = 20;
		        //cómo hacer que el usuario decida cuántos números quiere usar?
		        int n = 0;
		        int FibonacciN = 1;
		        		                
		        System.out.println("Secuencia de Fibonacci:");
		        
		        int contador = 0;		        
		        while (contador < num) {
		        	System.out.println(n + " " + FibonacciN);
		        	int sum = n + FibonacciN;
		        	n = FibonacciN;
		        	FibonacciN = sum;
		        	contador++;
		        }
		// TODO Auto-generated method stub

	}

}
