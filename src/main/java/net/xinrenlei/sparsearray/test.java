package net.xinrenlei.sparsearray;

import java.util.TreeMap;

public class test {
   public static void main(String[] args) {
       TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
       treeMap.put(1, 3);
       treeMap.put(2, 4);
       treeMap.put(5, 8);
       treeMap.put(3, 5);

    //    treeMap.pollFirstEntry();
       System.out.println(treeMap);
       for (Integer i: treeMap.values()){
           System.out.println(i);
       }
   }
}