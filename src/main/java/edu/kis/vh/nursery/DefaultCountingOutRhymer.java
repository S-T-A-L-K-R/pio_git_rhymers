package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.ListInterface;

public class DefaultCountingOutRhymer 
{
	private ListInterface numbers;
	public int total = 0;
    static final int MINUSE_ONE = -1;

	
	public DefaultCountingOutRhymer() {
		numbers = new IntArrayStack();
	}

	/** 
	 * @param in
	 */
	public void countIn(int in) 
	{
		if (!isFull()) 
		{
			numbers.push(in);
		}
	}

	
	/** 
	 * @return boolean
	 */
	public boolean callCheck() 
	{
		return numbers.isEmpty();
	}
		
	
	/** 
	 * @return boolean
	 */
	public boolean isFull() 
	{
		return numbers.isFull();
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
		return numbers.top();
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
		return numbers.pop();
	}

}
