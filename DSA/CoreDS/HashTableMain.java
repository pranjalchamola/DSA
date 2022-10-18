package GitCode.DSA.CoreDS;

import java.util.LinkedList;

public class HashTableMain {
    public static void main(String[] args) {
        MyHashTable ht=new MyHashTable();
        ht.put(2,111);
        ht.put(2,1112);
        System.out.println(ht.get(2));
    }
}
