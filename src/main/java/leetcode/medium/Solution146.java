package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Solution146 {

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

    class LRUCache {

        int capacity;
        // <Key, Node>
        Map<Integer, Node> map = new HashMap<>();
        Node head;
        Node tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>();

            this.head = new Node(0, 0);
            this.tail = new Node(0, 0);

            this.head.next = this.tail;
            this.tail.prev = this.head;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);

                // 조회된 노드를 가장 앞으로 옮겨야 함
                remove(node);
                insert(node);

                return node.value;
            }

            return -1;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                remove(map.get(key));
            }

            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insert(newNode);

            if (map.size() > capacity) {
                Node lruNode = this.tail.prev;
                remove(lruNode);
                map.remove(lruNode.key);
            }
        }

        private void insert(Node node) {
            Node next = this.head.next;

            this.head.next = node;
            next.prev = node;

            node.prev = this.head;
            node.next = next;
        }

        private void remove(Node node) {
            Node next = node.next;
            Node prev = node.prev;

            next.prev = prev;
            prev.next = next;
        }
    }
}
