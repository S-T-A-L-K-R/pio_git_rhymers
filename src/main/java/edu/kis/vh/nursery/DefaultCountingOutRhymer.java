package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer 
// TODO what this does actually?
{
	private int[] NUMBERS = new int[12];
	public int total = -1;

	
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
		return total == -1;
	}
		
	
	/** 
	 * @return boolean
	 */
	public boolean isFull() 
	{
		return total == 11;
	}
		
	
	/** 
	 * @return int
	 */
	protected int peekaboo() 
	{
		if (callCheck()) 
		{
			return -1;
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
			return -1;
		}
		return NUMBERS[total--];
	}

}
