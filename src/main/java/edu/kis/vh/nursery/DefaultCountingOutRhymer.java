package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer 
// TODO what this does actually?
{
	private static final int FULL_INT_2 = 12;
	private static final int MINUSE_ONE = -1;
	private final int[] NUMBERS = new int[FULL_INT_2];
	public int total = MINUSE_ONE;

	
	/** 
	 * @param in
	 */
	public void countIn(int in) 
	{
		if (!isFull()) 
		{
			NUMBERS[++total] = in;
		}
	}

	
	/** 
	 * @return boolean
	 */
	public boolean callCheck() 
	{
		return total == MINUSE_ONE;
	}
		
	
	/** 
	 * @return boolean
	 */
	public boolean isFull() 
	{
		return total == FULL_INT_2 - 1;
	}
		
	
	/** 
	 * @return int
	 */
	protected int peekaboo() 
	{
		if (callCheck()) 
		{
			return MINUSE_ONE;
		}
		return NUMBERS[total];
	}
			
	
	/** 
	 * @return int
	 */
	public int countOut() 
	{
		if (callCheck()) 
		{
			return MINUSE_ONE;
		}
		return NUMBERS[total--];
	}

}
