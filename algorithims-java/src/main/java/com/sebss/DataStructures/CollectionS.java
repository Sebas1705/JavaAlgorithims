package com.sebss.DataStructures;

public interface CollectionS<T> {
    public boolean add(T e);
    public boolean addAll(CollectionS<T> c);
    public void clear();
    public boolean contains(T e);
    public boolean containsAll(CollectionS<T> c);
    public boolean isEmpty();
    public boolean remove(T e);
    public boolean removeAll(CollectionS<T> c);
    public boolean retainAll(CollectionS<T> c);
    public int size();
    public Object[] toArray();
}
