import java.util.Arrays;

public class Trie {
    static final int Alphabet_Size = 26;

    static class TrieNode {
        TrieNode[] children = new TrieNode[Alphabet_Size];
        boolean isEndNode;

        TrieNode() {
            isEndNode = false;
            Arrays.fill(children, null);
        }

    }

    static TrieNode root;

    public static void insert(String key) {
        TrieNode current = root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(current.children[index]==null){
                TrieNode node=new TrieNode();
                current.children[index]=node;
                current=node;
            }
            else{
                current=current.children[index];
            }
        }
        current.isEndNode=true;
    }

    public static boolean search(String key) {
        TrieNode current = root;
        for(int i=0;i<key.length();i++) {
            int index = key.charAt(i) - 'a';
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
       return  current.isEndNode;
    }

    public static void main(String[] args) {
        String[] str = {"car", "cat", "do", "dog", "so", "song", "care"};
        root = new TrieNode();
        for (String s : str) {
            insert(s);
        }
        System.out.println("Is CARE present?"+search("care"));
    }
}
