package com.sebss.DataStructures.Interfaces;

public interface ListS<T> extends CollectionS<T>{
    public boolean add(T e);
    public boolean addAll(CollectionS<T> c);
    public boolean remove(T e);
    public boolean removeAll(CollectionS<T> c);
    public boolean retainAll(CollectionS<T> c);
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
