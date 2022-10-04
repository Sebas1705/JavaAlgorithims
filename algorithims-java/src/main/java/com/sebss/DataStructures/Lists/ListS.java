package com.sebss.DataStructures.Lists;

import com.sebss.DataStructures.CollectionS;
import com.sebss.Interfaces.Printable;

public interface ListS<T> extends CollectionS<T>, Printable{
    public void add(int i, T e);
    public boolean addAll(int i, CollectionS<? extends T> c);
    public T get(int i);
    public int indexOf(T e);
    public int lastIndexOf(T e);
    public T removeAt(int i);
    public T set(int i, T e);
    public ListS<T> subList(int fi, int ti);
    public void printAsArray();
}
