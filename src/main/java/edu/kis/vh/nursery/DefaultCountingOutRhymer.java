package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer 
{
	private static final int fullInt = 11;
	private static final int minusOne = -1;
	private static final int fullInt2 = 12;
	private final int[] NUMBERS = new int[fullInt2];
	public int total = minusOne;

	public void countIn(int in) 
	{
		if (!isFull()) 
		{
			NUMBERS[++total] = in;
		}
	}

	public boolean callCheck() 
	{
		return total == minusOne;
	}
		
	public boolean isFull() 
	{
		return total == fullInt;
	}
		
	protected int peekaboo() 
	{
		if (callCheck()) 
		{
			return minusOne;
		}
		return NUMBERS[total];
	}
			
	public int countOut() 
	{
		if (callCheck()) 
		{
			return minusOne;
		}
		return NUMBERS[total--];
	}

}
