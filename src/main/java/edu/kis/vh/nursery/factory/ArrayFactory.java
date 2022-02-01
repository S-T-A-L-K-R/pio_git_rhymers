package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class ArrayFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer GetStandardRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFalseRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFIFORhymer() {
		// TODO Auto-generated method stub
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetHanoiRhymer() {
		// TODO Auto-generated method stub
		return new HanoiRhymer();
	}

}
