import java.util.Scanner;
class NumberCount{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        
        	System.out.print("Enter number: ");
        	int number = scanner.nextInt();
        	scanner.close();
        
        	int count = 0;
        	int temp = number;
        
        	while (temp != 0) 
		{
            		temp /= 10;
            		count++;
        	}
        	System.out.println("The number " + number + " has " + count + " digits.");
    	}
}