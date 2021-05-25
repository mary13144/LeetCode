package day60;

/**
 * @Author Mu Wenxin
 * @Date 2021/4/14 20:07
 * @Version 1.0
 */
public class ImplementTrie_Prefix_Tree_208 {
    class Trie {
        private Trie[] children;
        private boolean isend;

        /** Initialize your data structure here. */
        public Trie() {
            children=new Trie[26];
            isend=false;
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie node = this;
            for (int i = 0;i<word.length();i++){
                char c = word.charAt(i);
                int index = c-'a';
                if (node.children[index]==null){
                    node.children[index]=new Trie();
                }
                node=node.children[index];
            }
            node.isend=true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie node = searchpre(word);
            return node!=null&&node.isend;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            return searchpre(prefix)!=null;
        }
        private Trie searchpre(String word){
            Trie node = this;
            for (int i =0;i<word.length();i++){
                char c = word.charAt(i);
                int index = c-'a';
                if (node.children[index]==null)
                    return null;
                node=node.children[index];
            }
            return node;
        }
    }
}
