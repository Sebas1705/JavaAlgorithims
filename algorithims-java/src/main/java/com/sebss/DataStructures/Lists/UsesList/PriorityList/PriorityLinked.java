package com.sebss.DataStructures.Lists.UsesList.PriorityList;

import com.sebss.DataStructures.Lists.ListS;
import com.sebss.DataStructures.Lists.Linked_List.SimpleLinked_List;

public class PriorityLinked<T> extends PriorityList<T>{
    
    //Constructors:
    public PriorityLinked(){
        pList=new SimpleLinked_List<PriorityObject<T>>();
    }
    @SuppressWarnings("unchecked")
    public PriorityLinked(T ...e){
        this();
        for(T x : e) add(x,0);
    }
    //End of constructors.

    //Override:
    @Override
    public ListS<T> subList(int fi, int ti) {
        ListS<T> temp = new SimpleLinked_List<>();
        for(int i=fi;i<=ti;i++)temp.add(pList.get(i).getObject());
        return temp;
    }
    @Override
    public void printAsArray() {
        String s ="PriorityArray: {";
        if(pList.size()!=0) for(int i=0;i<size();i++)s+=(i!=size()-1)?pList.get(i)+"|":pList.get(i);
        else s+="Empty";
        s+="} size("+size()+")"; 
        System.out.println(s);
    }
    @Override
    public String toString() {
        String s = "->PriorityArray("+size()+"):\n{";
        if(pList.size()!=0) for(int i=0;i<size();i++)s+=(i!=size()-1)?pList.get(i)+"|":pList.get(i);
        else s+="Empty\n";
        s+="}\n->End of PriorityArray.\n";
        return s;
    }
    
}
