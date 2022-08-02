package DSA_Theory;

import java.util.Hashtable;
import java.util.Map;

public class HashTables {

    public static void main(String[] args){

        /**---------------------HashTable----------------------------------*/
        // Unique data structure that stores unique keys to values.
        // FAST insertion, deletion, lookup of key/value pairs.
            // O(1) - Time Complexity
            // Excellent in terms of time at the cost of space.

        // - Does not allow null for both key/ value
        // - Does not maintain insertion order
        // - Uses put method to insert
        // - Synchronized (Thread safe)


        // Declaring a HashTable
        // Syntax: Hashtable<KeyType, ValueType> name = new Hashtable<>();
        Hashtable<Integer, String> ht = new Hashtable<>();

        // Inserting into a HashTable
        ht.put(101, "Sashil");
        ht.put(101, "Bob");
        ht.put(102, "Rahul");
        ht.put(103, "Steve");
        ht.put(12, "Mary");

        // Display
        for (Map.Entry m: ht.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }




        /**---------------------HashMap----------------------------------*/
    }

}
