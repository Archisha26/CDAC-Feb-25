class Swap{
	public static void main(String args[])
	{
		int n1 = 10;
		int n2 = 20;
		System.out.println("Before swapping:");
		System.out.println("First number: " + n1);
		System.out.println("Second number: " + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After swapping:");
		System.out.println("First number: " + n1);
		System.out.println("Second number: " + n2);
	}
}
