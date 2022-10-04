package com.sebss.DataStructures.Lists.Array_List;

import com.sebss.DataStructures.CollectionS;
import com.sebss.DataStructures.Lists.ListS;

public class Array_List<T> implements ListS<T>{

    //Atributtes: 
    private final int CAP_GROWTH=4;
    private Object array[];
    private int size; 
    private int capacity;
    //End of atributes.

    //Constructor:
    public Array_List(){
        array=new Object[CAP_GROWTH];
        size=0;
        capacity=CAP_GROWTH;
    }
    @SuppressWarnings("unchecked")
    public Array_List(CollectionS<T> c){
        this();
        for(T e : (T[]) c.toArray()) add(e);
    }
    @SuppressWarnings("unchecked")
    public Array_List(T ...e){
        this();
        for(T t : e) add(t);
    }
    //End of constructor.

    //Overrides:
    @Override
    public boolean add(T e) {
        
        return false;
    }

    @Override
    public boolean addAll(CollectionS<T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(T e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsAll(CollectionS<T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remove(T e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(CollectionS<T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(CollectionS<T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(int i, T e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean addAll(int i, CollectionS<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T get(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(T e) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(T e) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public T removeAt(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T set(int i, T e) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListS<T> subList(int fi, int ti) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void printAsArray() {
        // TODO Auto-generated method stub
        
    }
    //End of Overrides.
}
