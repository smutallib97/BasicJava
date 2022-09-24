class SumArgs{
	public static void main (String vs[])
	{
		int sum=0;
		System.out.println("Calculates Sum for below Integers");
		for(int i=0; i<vs.length; i++)
		{
		    System.out.println(vs[i]);
		    sum = sum + Integer.parseInt(vs[i]);
		}
		System.out.println("Sum: " +sum);
	}
}