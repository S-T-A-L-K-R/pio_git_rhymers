package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
	}

	//	public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	private final IntLinkedList temp = new IntLinkedList();
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
