import java.util.Scanner;
class NaturalNumbers{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        
        	System.out.print("Input a number: ");
        	int n = scanner.nextInt();
        	scanner.close();
        
        	System.out.print("First " + n + " natural numbers: ");
        	for (int i = 1; i <= n; i++) 
		{
            		System.out.print(i + " ");
        	}
    	}
}