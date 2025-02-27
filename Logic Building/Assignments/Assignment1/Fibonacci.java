import java.util.Scanner;
class Fibonacci 
{
    	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        	int firstTerm = 0, secondTerm = 1;
		System.out.print("Enter a number upto which number for printing the series: ");
        	int n = scanner.nextInt();
        	scanner.close();
        
        	System.out.print("Fibonacci Series: ");
        
        	for (int i = 1; i <= n; ++i) 
		{
            		System.out.print(firstTerm + " ");
            
            		int nextTerm = firstTerm + secondTerm;
            		firstTerm = secondTerm;
            		secondTerm = nextTerm;
        	}
    	}
}