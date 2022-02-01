package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	public final IntLinkedList temp = new IntLinkedList();
	@Override
	public int countOut() {
		while (!callCheck())
		{	
			temp.push(super.countOut());
		}
		int ret = temp.pop();
		
		while (!temp.isEmpty())
		{	
			countIn(temp.pop());
		}
		return ret;
	}
}
