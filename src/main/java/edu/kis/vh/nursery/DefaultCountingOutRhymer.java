package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.ListInterface;

public class DefaultCountingOutRhymer 
{
	// private int total = 0;
	final static int VALUE_IF_EMPTY = -1;
	private ListInterface numbers;
	public DefaultCountingOutRhymer() {
		this.numbers = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(ListInterface numbers) {
		this.numbers = numbers;
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
			return VALUE_IF_EMPTY;
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
			return VALUE_IF_EMPTY;
		}
		return numbers.pop();
	}

}
