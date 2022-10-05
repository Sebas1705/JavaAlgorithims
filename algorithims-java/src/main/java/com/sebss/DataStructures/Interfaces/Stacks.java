package com.sebss.DataStructures.Interfaces;

public interface Stacks<T> extends CollectionS<T> {
    public boolean push(T e);
    public boolean pushAll(CollectionS<T> c);
    public T pop();
}
