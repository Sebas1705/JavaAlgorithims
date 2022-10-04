package com.sebss;

import com.sebss.DataStructures.Lists.Linked_List.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DoubleCircularLinked_List<Integer> list = new DoubleCircularLinked_List<Integer>();
        for(int i=0;i<20;i++)list.add(i);
        list.add(0,100);
        list.add(4,1000);
        list.add(100);
        list.set(12,0);
        list.printAsArray();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        DoubleCircularLinked_List<Integer> list2 = new DoubleCircularLinked_List<Integer>();
        list2.add(1001);
        list2.add(1010);
        list2.addAll(2,list);
        list2.remove(1001);
        list2.removeAt(list2.size()-1);
        list2.printAsArray();
        list2.getLast().print();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
