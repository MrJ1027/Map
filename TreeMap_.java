package com.jtl.Map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author jtl
 * java学习用
 */
public class TreeMap_ {
    public static void main(String[] args) {

        //TreeMap<Object, Object> treeMap = new TreeMap<>();
        TreeMap treeMap = new TreeMap(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1);
            }
        });
        treeMap.put("caocao","曹操");
        treeMap.put("liubei","刘备");
        treeMap.put("sunquan","孙权");
        treeMap.put("zhugeliang","诸葛亮");
        System.out.println(treeMap);
    }
}
