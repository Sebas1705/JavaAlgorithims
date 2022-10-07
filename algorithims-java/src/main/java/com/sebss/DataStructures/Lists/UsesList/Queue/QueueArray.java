package com.sebss.DataStructures.Lists.UsesList.Queue;

import com.sebss.DataStructures.Interfaces.*;
import com.sebss.DataStructures.Lists.Array_List.Array_List;

public class QueueArray<T> implements Queue<T> {
    
    //Atributtes:
    private Array_List<T> queue;
    //End of Atributtes.

    //Constuctors:
    public QueueArray(){
        queue=new Array_List<>();
    }
    @SuppressWarnings("unchecked")
    public QueueArray(T ...e){
        this();
        for(T x : e) push(x);
    }
    public QueueArray(CollectionS<T> c){
        queue=new Array_List<T>(c);
    }
    //End of Constuctors.
    
    //Overrides:
    @Override
    public boolean isEmpty() {return queue.size()==0;}
    @Override
    public int size() {return queue.size();}
    @Override
    public Object[] toArray() {return queue.toArray();}
    @Override
    public boolean contains(T e) {return queue.contains(e);}
    @Override
    public boolean containsAll(CollectionS<T> c) {return queue.containsAll(c);}
    @Override
    public void clear() {queue.clear();}
    @Override
    public boolean push(T e) {return queue.add(e);}
    @Override
    public boolean pushAll(CollectionS<T> c) {return queue.addAll(c);}
    @Override
    public T pop() {return queue.removeAt(0);}
    @Override
    public String toString(){
        String s = "->QueueArray("+size()+"):\n{";
        if(queue.size()!=0) for(int i=0;i<size();i++)s+=(i!=size()-1)?queue.get(i)+"|":queue.get(i);
        else s+="Empty\n";
        s+="}\n->End of QueueArray.\n";
        return s;
    }
    @Override
    public void print(){System.out.println(this);}
    public void printAsArray(){
        String s ="QueueArray: {";
        if(queue.size()!=0) for(int i=0;i<size();i++)s+=(i!=size()-1)?queue.get(i)+"|":queue.get(i);
        else s+="Empty";
        s+="} size("+size()+")"; 
        System.out.println(s);
    }
    //End of Overrides.

}
