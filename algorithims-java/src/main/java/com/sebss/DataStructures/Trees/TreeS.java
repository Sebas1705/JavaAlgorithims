package com.sebss.DataStructures.Trees;

import com.sebss.DataStructures.Interfaces.CollectionS;

public interface TreeS<T> extends CollectionS<T>{
    public boolean add(T e);
    public boolean addAll(CollectionS<T> c);
    public boolean remove(T e);
    public boolean removeAll(CollectionS<T> c);
    public T get(int i);
    public int indexOf(T e);
    public T set(int i, T e);
    public void printAsArray();
}
