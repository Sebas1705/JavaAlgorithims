package com.sebss.DataStructures.Lists.UsesList.Stacks;

import com.sebss.DataStructures.Interfaces.CollectionS;
import com.sebss.DataStructures.Interfaces.Stacks;
import com.sebss.DataStructures.Lists.Array_List.Array_List;

public class StackArray<T> implements Stacks<T>{
    
    //Atributtes:
    private Array_List<T> stack;
    //End of Atributtes.

    //Constuctors:
    public StackArray(){
        stack=new Array_List<>();
    }
    public StackArray(T ...e){
        this();
        for(T x : e) push(x);
    }
    @SuppressWarnings("unchecked")
    public StackArray(CollectionS<T> c){
        this();
        for(T x : (T[]) c.toArray()) push(x);
    }
    //End of Constuctors.
    
    //Overrides:
    @Override
    public boolean isEmpty() {return stack.size()==0;}
    @Override
    public int size() {return stack.size();}
    @Override
    public Object[] toArray() {return stack.toArray();}
    @Override
    public boolean contains(T e) {return stack.contains(e);}
    @Override
    public boolean containsAll(CollectionS<T> c) {return stack.containsAll(c);}
    @Override
    public void clear() {stack.clear();}
    @Override
    public boolean push(T e) {return stack.add(e);}
    @Override
    public boolean pushAll(CollectionS<T> c) {return stack.addAll(c);}
    @Override
    public T pop() {return stack.removeAt(stack.size()-1);}
    //End of Overrides.

}
