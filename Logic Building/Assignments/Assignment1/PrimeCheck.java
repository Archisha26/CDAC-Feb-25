import java.util.Scanner;
class PrimeCheck {
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        
        	System.out.print("Enter a number: ");
        	int num = scanner.nextInt();
        	scanner.close();
        
        	if (num <= 1) 
		{
            		System.out.println("The number " + num + " is not Prime.");
        	} 
		else 
		{
            		int i = 2;
            		while (i < num) 
			{
               	 		if (num % i == 0) 
				{
                   			System.out.println("The number " + num + " is not Prime.");
                    			break;
                		}
                		i++;
            		}
            		if (i == num) 
			{
                		System.out.println("The number " + num + " is Prime.");
            		}
        	}
    	}
}
