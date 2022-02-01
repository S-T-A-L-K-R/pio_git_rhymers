package edu.kis.vh.nursery.list;

public class IntArrayStack implements ListInterface {
    private int[] NUMBERS = new int[12];
	public int total = -1;

	
	/** 
	 * @param in
	 */
	@Override
	public void push(int in)
	{
		if (!isFull()) 
		{
			NUMBERS[++total] = in;
		}
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty()
	{
		return total == -1;
	}
		
	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isFull()
	{
		return total == 11;
	}
		
	
	/** 
	 * @return int
	 */
	@Override
	public int top()
	{
		if (isEmpty()) 
		{
			return -1;
		}
		return NUMBERS[total];
	}
			
	
	/** 
	 * @return int
	 */
	@Override
	public int pop()
	{
		if (isEmpty()) 
		{
			return -1;
		}
		return NUMBERS[total--];
	}

}
