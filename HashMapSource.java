package com.jtl.Map_;

import java.util.HashMap;

/**
 * @author jtl
 * java学习用
 */
public class HashMapSource {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("java",10);
        hashMap.put("C++",10);
        hashMap.put("java",20);//替换value
        System.out.println("hashMap = " + hashMap);
        //HashMap源码:
        //1.执行构造器 new HashMap()
        //初始化加载因子，loadFactor = 0.75
        // HashMap$Node[] table = null
        //2.执行put 调用hash方法计算key的hash值(h = key.hashCode()) ^ (h >>> 16)
        /*
        *    public V put(K key, V value) {K="java" V=10
                return putVal(hash(key), key, value, false, true);
            }
        *
        *3.执行putVal
        *  final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
                * //如果底层的table数组为null，就扩容到16
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                    * //取出hash值对应的table的索引位置的Node，如果为null，就直接把加入的k-v
                    * //创建成一个Node，加入到该位置即可
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    Node<K,V> e; K k;
                    if (p.hash == hash &&//如果table的索引位置的key的hash和新的key的hash值相同，
                    * 并且满足(现有的结点的key和准备添加的key是同一个对象 || equals返回真)
                    * 就认为不能加入新的k-v
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    else if (p instanceof TreeNode)//如果当前的table已有的Node已经树化，就按照红黑树方式处理
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {
                    * //如果找到的结点后面是链表，就死循环依次比较，直到break
                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) {//如果整条链表都没有相同的，就加到最后
                                p.next = newNode(hash, key, value, null);
                                * //加入后，判断当前链表个数，是否已经到8个，到8个后进行红黑树树化
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash &&//如果在循环比较过程中，发现有相同，就break
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;//替换动作
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                if (++size > threshold)//size达到临界值就扩容
                    resize();
                afterNodeInsertion(evict);
                return null;
            }
        *
        *
        * 4.树化 ---> 转成红黑树
        * //如果table为null或者大小还没有到64，就先进行扩容，先不树化
        *  if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
            resize();
        *
        * */
    }
}
