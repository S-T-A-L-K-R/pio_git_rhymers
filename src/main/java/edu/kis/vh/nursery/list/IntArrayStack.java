package edu.kis.vh.nursery.list;

public class IntArrayStack implements ListInterface {
	private int MAX_SIZE = 12;
	private int[] NUMBERS = new int[MAX_SIZE];
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
		return total == VALUE_IF_EMPTY;
	}
		
	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isFull()
	{
		return total == MAX_SIZE - 1;
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
