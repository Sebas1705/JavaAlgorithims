package com.sebss.DataStructures.Hashs.CloseHash;

import com.sebss.DataStructures.Hashs.HashS;
import com.sebss.DataStructures.Interfaces.CollectionS;
import com.sebss.DataStructures.Lists.ListS;
import com.sebss.DataStructures.Lists.Array_List.Array_List;

public class HashCloseArray<T> implements HashS<T> {

    //Atributes: 
    private Array_List<T> elements;
    private Array_List<Boolean> flagsB,flagsO;
    private final int maxSize;
    //End of attributes.

    //Constructors: 
    public HashCloseArray(){
        this(10);
    }
    public HashCloseArray(int maxS){
        maxSize=maxS;
        elements=new Array_List<T>(maxS,null);
        flagsB=new Array_List<Boolean>(maxS,false);
        flagsO=new Array_List<Boolean>(maxS,false);
    }
    @SuppressWarnings("unchecked")
    public HashCloseArray(CollectionS<T> c){
        this(c.size());
        for(T e : (T[]) c.toArray()) add(e);
    }
    @SuppressWarnings("unchecked")
    public HashCloseArray(int maxS,T...e){
        this(maxS);
        for(T x : e) add(x);
    }
    //End of constructors.

    //Overrides:
    @Override
    public boolean isEmpty() {
        boolean isEmpty=true;
        for(int i=0;i<maxSize;i++)
            if(elements.get(i)!=null)
                isEmpty=false;
        return isEmpty;
    }
    @Override
    public int size() {return maxSize;}
    @Override
    public Object[] toArray() {return elements.toArray();}
    @Override
    public boolean contains(T e) {return elements.contains(e);}
    @Override
    public boolean containsAll(CollectionS<T> c) {return elements.containsAll(c);}
    @Override
    public void clear() {elements=new Array_List<T>(maxSize,null);}
    @Override
    public void print() {System.out.println(this);}
    @Override
    public boolean add(T e) {
        int code=e.hashCode()%maxSize;
        
    }
    @Override
    public boolean addAll(CollectionS<T> c) {
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
    public T removeAt(int hashCode) {
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
