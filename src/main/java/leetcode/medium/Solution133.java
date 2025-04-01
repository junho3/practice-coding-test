package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution133 {

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph1(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        Node clone = new Node(node.val);

        map.put(node, clone);
        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            for (Node neighbor : temp.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }

                map.get(temp).neighbors.add(map.get(neighbor));
            }
        }

        return clone;
    }

    public Node cloneGraph2(Node node) {
        if (node == null) {
            return null;
        }

        Node clone = new Node(node.val);
        Map<Integer, Node> map = new HashMap<>();
        map.put(node.val, clone);

        dfs(node, map);

        return clone;
    }

    private void dfs(Node node, Map<Integer, Node> map) {
        for (Node neighbor : node.neighbors) {
            if (!map.containsKey(neighbor.val)) {
                map.put(neighbor.val, new Node(neighbor.val));

                dfs(neighbor, map);
            }

            map.get(node.val).neighbors.add(map.get(neighbor.val));
        }
    }
}
