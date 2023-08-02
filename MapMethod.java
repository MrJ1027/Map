package com.jtl.Map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jtl
 * java学习用
 */
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("刘备",new Book("三国演义",200));//不输出，被下面替代
        map.put("刘备","孙尚香");
        map.put("关羽","张飞");
        map.put("赵云","张飞");
        map.put("诸葛亮",null);
        map.put(null,"曹操");
        map.put("孙权","鲁肃");
        System.out.println("map=" + map);
        map.remove(null);
        System.out.println("map=" + map);
        Object val = map.get("孙权");
        System.out.println("val = " + val);
        System.out.println("size = " + map.size());
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println("map=" + map);
        System.out.println(map.containsKey("庞统"));//查找键是否存在


    }
}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
