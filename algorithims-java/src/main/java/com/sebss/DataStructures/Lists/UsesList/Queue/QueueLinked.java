package com.sebss.DataStructures.Lists.UsesList.Queue;

import com.sebss.DataStructures.Interfaces.CollectionS;
import com.sebss.DataStructures.Interfaces.Queue;
import com.sebss.DataStructures.Lists.Linked_List.SimpleLinked_List;

public class QueueLinked<T> implements Queue<T> {
    
    //Atributtes:
    private SimpleLinked_List<T> queue;
    //End of Atributtes.

    //Constuctors:
    public QueueLinked(){
        queue=new SimpleLinked_List<>();
    }
    @SuppressWarnings("unchecked")
    public QueueLinked(T ...e){
        this();
        for(T x : e) push(x);
    }
    public QueueLinked(CollectionS<T> c){
        queue=new SimpleLinked_List<T>(c);
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
