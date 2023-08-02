package com.jtl.Map_;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author jtl
 * java学习用
 */
public class HashMapSource02 {
    public static void main(String[] args) {
        HashMap<A, String> hashMap = new HashMap<>();
        for(int i = 0; i <= 12; i++){
            hashMap.put(new A(i),"jtl");//每次的key都不一样，但是hash值是一样的
        }

        System.out.println("hashMap =" + hashMap);
    }
}

class A{
    private int num;
    public A(int num){
        this.num = num;
    }


    //所有的A对象的hashCode都是100，计算出来的索引一致，形成链表
//    @Override
//    public int hashCode() {
//        return 100;
//    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}
