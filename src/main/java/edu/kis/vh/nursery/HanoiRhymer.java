package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer 
{
	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final int zeroInt = 0;
	int totalRejected = zeroInt;

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
