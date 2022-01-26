package edu.kis.vh.nursery.list;

public class IntArrayStack {
    private int[] NUMBERS = new int[12];
	public int total = -1;

	
	/** 
	 * @param in
	 */
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
	public boolean isEmpty() 
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
	public int pop() 
	{
		if (isEmpty()) 
		{
			return -1;
		}
		return NUMBERS[total--];
	}

}
