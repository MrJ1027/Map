package com.jtl.Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author jtl
 * java学习用
 */
public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("No1","jtl");
        map.put("No2","刘备");

        //1.k-v 最后是 HashMap$Node node = newNode(hash, key, value, null);
        //2.k-v 为了方便遍历，还会创建EntrySet集合,该集合存放的元素的类型是Entry(键值对)
        //而一个Entry对象就包含了k，v，EntrySet<Entry<K,V>>即： transient Set<Map.Entry<K,V>> entrySet
        //3.在entrySet中，定义的类型是Map.Entry,但是实际上存放的还是HashMap$Node
        //因为HashMap$Node implements Map.Entry
        //4.当把HashMap$Node对象存放到entrySet就方便我们的遍历
        // 因为Map.Entry提供了两个重要方法 ： V getValue(); K getKey();

        Set set = map.entrySet();
        System.out.println(set.getClass());//HashMap$EntrySet
        for (Object obj : set) {
            //System.out.println(obj.getClass());//HashMap$Node
            //为了从HashMap$Node取出k-v
            //1.先向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }

        Set set1 = map.keySet();//把key值封装到KeySet
        Collection values = map.values();//把value值封装到Values



    }
}
