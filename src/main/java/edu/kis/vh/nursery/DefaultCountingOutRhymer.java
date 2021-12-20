package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer 
{
	private static final int FULL_INT_2 = 12;
	private static final int MINUSE_ONE = -1;
	private final int[] NUMBERS = new int[FULL_INT_2];
	public int total = MINUSE_ONE;

	public void countIn(int in) 
	{
		if (!isFull()) 
		{
			NUMBERS[++total] = in;
		}
	}

	public boolean callCheck() 
	{
		return total == MINUSE_ONE;
	}
		
	public boolean isFull() 
	{
		return total == FULL_INT_2 - 1;
	}
		
	protected int peekaboo() 
	{
		if (callCheck()) 
		{
			return MINUSE_ONE;
		}
		return NUMBERS[total];
	}
			
	public int countOut() 
	{
		if (callCheck()) 
		{
			return MINUSE_ONE;
		}
		return NUMBERS[total--];
	}

}
