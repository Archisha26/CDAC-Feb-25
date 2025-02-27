import java.util.Scanner;
class PowerCalculation{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        
        	System.out.print("Enter base number: ");
        	int base = scanner.nextInt();
        
        	System.out.print("Enter exponent number: ");
        	int exponent = scanner.nextInt();
        	scanner.close();
        
        	int result = 1;
        	for (int i = 0; i < exponent; i++) 
		{
            		result *= base;
        	}
        
        	System.out.println(base + " raised to the power " + exponent + " is " + result);
    	}
}