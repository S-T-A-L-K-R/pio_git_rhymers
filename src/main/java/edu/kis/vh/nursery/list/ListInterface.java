package edu.kis.vh.nursery.list;

public interface ListInterface {
    
    static final int VALUE_IF_EMPTY = -1;
    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
