package com.wyfdc.go.leetcode;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class LRUCache{

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(10);
        cache.set(1,1);
        cache.set(2,2);
        cache.set(3,3);
        cache.set(4,4);
        soutLRUCache(cache);
    }

    private static void soutLRUCache(LRUCache cache) {
        cache.getCache().keySet().forEach(x-> System.out.println(x+","+cache.getCache().get(x)));
    }

    private final int capacity;
    private Map<Integer, Node> cache;
    private Node dummyHead = new Node();
    private Node tail = new Node();


    private Map<Integer, Node> getCache(){
        return cache;
    }


    public LRUCache(int capacity) {
        if (capacity <= 0) {
            throw new InvalidParameterException("Cache capacity should be larger than 0");
        }
        this.capacity = capacity;
        cache = new HashMap<Integer, Node>(capacity);
        dummyHead.next = tail;
        dummyHead.prev = null;
        tail.prev = dummyHead;
        tail.next = null;
    }

    public void set(int key, int val) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.val = val;
            moveToHead(node);
        } else {
            Node newNode = new Node(key, val);
            addFirst(newNode);
            cache.put(key, newNode);
            if (cache.size() > capacity) {
                int toRemove = removeLast();
                cache.remove(toRemove);
            }
        }
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key);
        moveToHead(node);
        return node.val;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addFirst(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addFirst(Node n) {
        n.prev = dummyHead;
        n.next = dummyHead.next;
        n.next.prev = n;
        n.prev.next = n;
    }

    private int removeLast() {
        int key = tail.prev.key;
        removeNode(tail.prev);
        return key;
    }

    class Node {

        Node prev;
        Node next;
        int key;
        int val;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
