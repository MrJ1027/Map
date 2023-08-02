package com.jtl.Map_;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/**
 * @author jtl
 * java学习用
 * Map接口的遍历方法
 *
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("刘备","孙尚香");
        map.put("关羽","张飞");
        map.put("赵云","张飞");

        map.put("孙权","鲁肃");

        //第一组：先取出所有的Key，再通过Key取出Value，因为Key可以找到Value
        Set keySet = map.keySet();//把键拿出来放到Set这个单列集合里面遍历，然后通过Key找Value
        //1.增强for
        System.out.println("--------第一种方式--------：");
        for(Object key : keySet){
            System.out.println(key + "-" + map.get(key));
        }
        //2.迭代器
        System.out.println("--------------------------");
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("--------------------------");

        //第二组：先取出所有的Value
        Collection values = map.values();
        //可以使用所有Collection使用的遍历方法


        //第三组：通过EntrySet(键值对存放在Set这个单列集合中，K+V的整体，在java中叫Entry)来获取k-v
        Set<Map.Entry<String,String>> entrySet = map.entrySet();//EntrySet<Map.Entry<K,V>>
        for(Map.Entry<String,String> entry : entrySet){
           String key = entry.getKey();
           String value = entry.getValue();
            System.out.println(key + "-" + value);
        }
        System.out.println("------------------------");
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object next = iterator1.next();
            //向下转型： Map.Entry
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
