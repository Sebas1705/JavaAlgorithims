package com.sebss;

import java.util.ArrayList;

import com.sebss.DataStructures.Lists.Array_List.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Array_List<Integer> list = new Array_List<Integer>(1,1,2,4,45,2,2,2,2,1);
        list.printAsArray();
        System.out.println(list.lastIndexOf(12));
        list.printAsArray();
    }
}
