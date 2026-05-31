package LRU;

import java.util.HashMap;
import java.util.Map;

/**
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 *
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache.
 * If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 *
 *
 */
public class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    Map<Integer, Node> map;

    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;

    }

    private int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            deleteNode(node);
            addNode(node);

            return node.value;
        }

        return head.value;
    }

    private void put(int key, int value) {
        if (map.containsKey(key)) {
            deleteNode(map.get(key));
            map.remove(key);
        }

        if(map.size() == capacity) {
            Node leastUsed = tail.prev;
            deleteNode(leastUsed);
            map.remove(leastUsed.key);
        }

        Node newNode = new Node(key,value);
        addNode(newNode);
        map.put(key, newNode);

    }

    private void addNode(Node newNode) {
        Node nextNode = head.next;

        newNode.next = nextNode;
        newNode.prev = head;

        head.next = newNode;
        nextNode.prev = newNode;
    }

    private void deleteNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }


    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);

        lruCache.put(1,2);
        lruCache.put(2,3);
        lruCache.put(5,4);
        lruCache.put(7,5);

        lruCache.put(5,7);

        int value = lruCache.get(5);

        System.out.println(value);
    }

}

//Input
//["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
//        [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
//Output
//[null, null, null, 1, null, -1, null, -1, 3, 4]
//
//Explanation
//LRUCache lRUCache = new LRUCache(2);
//lRUCache.put(1, 1); // cache is {1=1}
//lRUCache.put(2, 2); // cache is {1=1, 2=2}
//lRUCache.get(1);    // return 1
//lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//lRUCache.get(2);    // returns -1 (not found)
//lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//lRUCache.get(1);    // return -1 (not found)
//lRUCache.get(3);    // return 3
//lRUCache.get(4);    // return 4