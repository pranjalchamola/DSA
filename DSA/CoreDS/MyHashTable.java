package GitCode.DSA.CoreDS;

import java.util.LinkedList;

public class MyHashTable {
    private class keyValue
    {
        private int key;
        private int value;

        public keyValue(int k, int v)
        {
            key=k;
            value=v;
        }

        public int getKey()
        {
            return key;
        }
        public int getValue()
        {
            return value;
        }
    }


    LinkedList<keyValue>[] entries=new LinkedList[100];

    public void put(int key, int value) {
        int index=hashing(key);
        if(entries[index]==null)
            entries[index]=new LinkedList();
        for(var entry:entries[index])
        {
            if(entry.key==key)
            {
                entry.value=value;
                return;
            }
        }
        entries[index].addLast(new keyValue(key,value));
    }

    public int get(int key) {
        int index=hashing(key);
        if(entries[index]==null)
            return -1;
        for(var entry:entries[index])
        {
            if(entry.key==key)
                return entry.value;
        }
        return -1;
    }

    public void remove(int key) {
        int index=hashing(key);
        if(entries[index]==null)
            return;
        for(int i=0;i<entries[index].size();i++)
        {
            if(entries[index].get(i).key==key)
                entries[index].remove(i);
        }
    }

    private int hashing(int key)
    {
        return key%entries.length;
    }

}
