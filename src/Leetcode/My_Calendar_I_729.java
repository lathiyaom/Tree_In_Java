package Leetcode;

import java.util.TreeMap;

public class My_Calendar_I_729 {
    public static void main(String[] args) {

    }
}
class MyCalendar {
TreeMap<Integer,Integer>map;
    public MyCalendar() {
        map=new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer preval=map.lowerKey(end);
        if(preval!=null && start<=map.get(preval)-1)
        {
            return false;
        }
        map.put(start,end);
        return true;
    }
}
