package edu.kis.vh.nursery.list;

public class IntLinkedList implements ListInterface
{
	private Node last;

	@Override
	public void push(int i)
	{
		if (getLast() == null)
		{
			setLast(new Node(i));
		}
		else 
		{
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	@Override
	public boolean isEmpty()
	{
		return getLast() == null;
	}

	@Override
	public boolean isFull()
	{
		return false;
	}

	@Override
	public int top()
	{
		if (isEmpty())
		{
			return MINUSE_ONE;
		}
		return getLast().getValue();
	}

	@Override
	public int pop()
	{
		if (isEmpty())
		{
			return MINUSE_ONE;
		}
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
}
