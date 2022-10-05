package com.sebss.DataStructures.Interfaces;

public interface CollectionS<T> {
    public boolean isEmpty();
    public int size();
    public Object[] toArray();
    public boolean contains(T e);
    public boolean containsAll(CollectionS<T> c);
    public void clear();
}
