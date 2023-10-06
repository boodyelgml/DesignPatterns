package com.example.DesignPatterns.Behavioral.iterator;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {
    private int[] data;
    private int currentIndex;

    public MyIterator(int[] data) {
        this.data = data;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < data.length;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            int nextValue = data[currentIndex];
            currentIndex++;
            return nextValue;
        } else {
            throw new java.util.NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }
}