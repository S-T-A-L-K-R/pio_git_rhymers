package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.ListInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer 
{
	public HanoiRhymer(ListInterface numbers) {
		super(numbers);
	}
	public HanoiRhymer() {
	}
	private static final int zeroInt = 0;
	private int totalRejected = zeroInt;

	

	public int reportRejected() 
	{
		return totalRejected;
	}

	@Override
	public void countIn(int in)
	{
		if (!callCheck() && in > peekaboo())
		{
			totalRejected++;
		}
		else
		{
			super.countIn(in);
		}
	}
}
