package J19_Tries;

public class Trie {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false; // EndOfWord

        Node() {
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }

    }

    public static Node root = new Node();


    public static void insert(String word){ // O(L) length of largest word
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx=key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow == true;
//        return curr.eow; // if it is false then if means it is not the full word
    }

    public static void main(String[] args){
        String[] words={"the", "a", "there", "their", "any", "thee"};
        for (String word : words) {
            insert(word);
        }

        System.out.println(search("their"));
    }
}
