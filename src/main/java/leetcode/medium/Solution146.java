package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Solution146 {

    class Node {
        Node next;
        Node prev;
        int key;
        int value;

        public Node(int key, int value) {
            this.next = null;
            this.prev = null;
            this.key = key;
            this.value = value;
        }
    }

    class LRUCache {

        private int capacity;
        private Map<Integer, Node> map;
        private Node left;
        private Node right;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>();
            this.left = new Node(0, 0);
            this.right = new Node(0, 0);
            this.left.next = this.right;
            this.right.prev = this.left;
        }

        public int get(int key) {
            // 조회하면 최신 캐시로 갱신
            if (map.containsKey(key)) {
                Node data = map.get(key);
                remove(data);
                insert(data);
                return data.value;
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

            // 용량을 넘으면 오래된 캐시 제거
            if (map.size() > capacity) {
                Node lru = this.right.prev;
                remove(lru);
                map.remove(lru.key);
            }
        }

        private void insert(Node node) {
            Node next = this.left.next;
            next.prev = node;
            node.next = next;
            node.prev = this.left;
            this.left.next = node;
        }

        private void remove(Node node) {
            Node next = node.next;
            Node prev = node.prev;
            prev.next = next;
            next.prev = prev;
        }
    }
}
