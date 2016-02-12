package com.example.company.areal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 10/02/2016.
 */
public class ListViewTopics {
    public static List<course> data= new ArrayList<>();


    static {
        int item = 3;
        item++;


        data.add(new course(10101,"THIS IS ITEM 1","DESCRPTION OF OUR ITEM",3));
        data.add(new course(10102, "THIS IS ITEM 2 ", "DESCRIPTION OF ITEM 2", 2));
        data.add(new course(10103, "THIS IS ITEM 3","DESCRIPTION OF ITEM 3", 3));
        data.add(new course(10104, "This is Item"+item,"Description of ITEM " +item,4));
        data.add(new course(10105,"THIS IS ITEM 5","DESCRPTION OF OUR ITEM",3));
        data.add(new course(10106, "THIS IS ITEM 6 ", "DESCRIPTION OF ITEM 2", 2));
        data.add(new course(10107, "THIS IS ITEM 7","DESCRIPTION OF ITEM 3", 3));
        data.add(new course(10108, "This is Item"+item,"Description of ITEM " +item,4));
        data.add(new course(10109,"THIS IS ITEM 8","DESCRPTION OF OUR ITEM",3));
        data.add(new course(30103, "THIS IS ITEM 9 ", "DESCRIPTION OF ITEM 2", 2));
        data.add(new course(30104, "THIS IS ITEM 10","DESCRIPTION OF ITEM 3", 3));
        data.add(new course(40101, "This is Item"+item,"Description of ITEM " +item,4));
        data.add(new course(40102,"THIS IS ITEM 12","DESCRPTION OF OUR ITEM",3));
        data.add(new course(50101, "THIS IS ITEM 13 ", "DESCRIPTION OF ITEM 2", 2));
        data.add(new course(50102, "THIS IS ITEM 14","DESCRIPTION OF ITEM 3", 3));
        data.add(new course(60101, "This is Item"+item,"Description of ITEM " +item,4));


    }
    public static List<course> getData() {
        return data;
    }
}
