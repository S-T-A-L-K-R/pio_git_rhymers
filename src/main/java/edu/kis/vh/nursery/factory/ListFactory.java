package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class ListFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer GetStandardRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer(1);
	}

	@Override
	public DefaultCountingOutRhymer GetFalseRhymer() {
		// TODO Auto-generated method stub
		return new DefaultCountingOutRhymer(1);
	}

	@Override
	public DefaultCountingOutRhymer GetFIFORhymer() {
		// TODO Auto-generated method stub
		return new FIFORhymer(1);
	}

	@Override
	public DefaultCountingOutRhymer GetHanoiRhymer() {
		// TODO Auto-generated method stub
		return new HanoiRhymer(1);
	}

}
