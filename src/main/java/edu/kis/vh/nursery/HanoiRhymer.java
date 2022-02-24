package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer 
{
	public HanoiRhymer() {
		super();
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
