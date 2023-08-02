package com.jtl.Map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jtl
 * java学习用
 */
public class Map_ {
    public static void main(String[] args) {
        //Map接口实现类的特点：
        //1.Map与Collection并列存在，用于保存具有映射关系的数据：Key-Value(双列元素)
        //2.Map中的key和value可以是任何引用类型的数据，会封装到HashMap$Node对象中
        //3.Map中的key不允许重复，原因和HashSet一样
        //4.Map中的value可以重复
        //5.Map中的key和value都可以为null，但是key为null只能存在一个，value为null可以多个
        //6.常用String类作为Map的key,但实际上只要是Object子类都可以作为key
        //7.key和value之间存在单向一对一关系，即通过指定的key总能找到对应的value
        //->map.get(Object key);通过get方法传入key会返回对应的value(唯一确定，因为key是唯一的)
        //

        Map map = new HashMap();
        map.put("No1","jtl");//k-v
        map.put("No2","刘备");
        map.put("No1","诸葛亮");//当有相同的k，就等价与替换
        map.put("No3","诸葛亮");//value可以重复(不在同一条链表上)
        map.put(null,null);
        map.put(null,"曹操");//把上面的null替换为"曹操"
        map.put("No4","曹操");
        System.out.println("map=" + map);
        //map={No2=刘备, null=曹操, No1=诸葛亮, No4=曹操, No3=诸葛亮}
    }
}
