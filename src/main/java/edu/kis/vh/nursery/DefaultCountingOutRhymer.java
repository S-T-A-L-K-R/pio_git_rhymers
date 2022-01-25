package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer 
// TODO what this does actually?
{
	private static final int MINUSE_ONE = -1;
	private final IntLinkedList NUMBERS = new IntLinkedList();
	public int total = MINUSE_ONE;

	
	/** 
	 * @param in
	 */
	public void countIn(int in) 
	{
		if (!isFull()) 
		{
			NUMBERS.push(in);
		}
	}

	
	/** 
	 * @return boolean
	 */
	public boolean callCheck() 
	{
		return NUMBERS.isEmpty();
	}
		
	
	/** 
	 * @return boolean
	 */
	public boolean isFull() 
	{
		return NUMBERS.isFull();
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
		return NUMBERS.top();
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
		return NUMBERS.pop();
	}

}
