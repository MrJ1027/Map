package com.jtl.Map_;

import java.util.Hashtable;

/**
 * @author jtl
 * java学习用
 */
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable<Object, Object> table = new Hashtable<>();
        //NullPointerException，key和value都不能为null
//        table.put(null,100);
//        table.put(100,null);
//        table.put(null,null);
        table.put("jtl",20000);
        table.put("cqh",10000);
        table.put("cqh1",10000);
        table.put("cqh2",10000);
        table.put("cqh3",10000);
        table.put("cqh4",10000);
        table.put("cqh5",10000);
        table.put("cqh6",10000);
        table.put("cqh7",10000);
        table.put("cqh8",10000);
    }
}
//Hashtable的底层(线程安全，效率较低，不允许null键和null值)
//1.底层有数组Hashtable$Entry[] 初始化大小为11
//2.临界值threshold 大小为 8 --> 11 * 0.75
//3.扩容:按照自己的扩容机制来进行 --> rehash()方法 --> (oldCapacity << 1) + 1
//即×2然后＋1
//4.执行方法 addEntry(hash,key,value,index); 添加到K-V 封装到Entry
//5.当count >= threshold 时，进行扩容
