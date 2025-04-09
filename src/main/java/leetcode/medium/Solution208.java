package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Solution208 {

    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }

    class Trie {

        private final TrieNode root;

        public Trie() {
            this.root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;

            for (char ch : word.toCharArray()) {
                if (!node.children.containsKey(ch)) {
                    node.children.put(ch, new TrieNode());
                }
                node = node.children.get(ch);
            }

            node.isEnd = true;
        }

        public boolean search(String word) {
            TrieNode node = root;

            for (char ch : word.toCharArray()) {
                if (!node.children.containsKey(ch)) {
                    return false;
                }

                node = node.children.get(ch);
            }

            return node.isEnd;
        }

        public boolean startsWith(String prefix) {
            TrieNode node = root;

            for (char ch : prefix.toCharArray()) {
                if (!node.children.containsKey(ch)) {
                    return false;
                }

                node = node.children.get(ch);
            }

            return true;
        }
    }
}
