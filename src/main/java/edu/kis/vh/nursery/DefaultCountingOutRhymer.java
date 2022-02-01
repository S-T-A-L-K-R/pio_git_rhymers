package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.ListInterface;

public class DefaultCountingOutRhymer 
// TODO what this does actually?
{
	public void push(int in) {
		NUMBERS.push(in);
	}


	public boolean isEmpty() {
		return NUMBERS.isEmpty();
	}


	public int top() {
		return NUMBERS.top();
	}


	public int pop() {
		return NUMBERS.pop();
	}


	private static final int MINUSE_ONE = 0;
	// private final IntLinkedList NUMBERS = new IntLinkedList();
	private final ListInterface NUMBERS;// = new IntArrayStack();
	public int total = MINUSE_ONE;

	
	public DefaultCountingOutRhymer() {
		NUMBERS = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(int value) {
		NUMBERS = new IntLinkedList();
	}

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
