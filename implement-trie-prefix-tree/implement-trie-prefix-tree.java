class Trie {

    /** Initialize your data structure here. */
    class TrieNode{
        boolean isLeaf;
        Map<Character,TrieNode> map;
        char id;
        public TrieNode(char id,boolean isLeaf){
            this.id=id;
            map=new HashMap<>();
            this.isLeaf=isLeaf;
        }
    }
    TrieNode root;
    public Trie() {
        root=new TrieNode('*',false);
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node=root;
        Map<Character,TrieNode> map;
        for(int i=0;i<word.length();i++){
            map=node.map;
            node=map.getOrDefault(word.charAt(i),new TrieNode(word.charAt(i),false));
            map.put(word.charAt(i),node);
        }
         node.isLeaf=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            Map<Character,TrieNode> map=node.map;
            if(map.containsKey(word.charAt(i)))
                 node=map.get(word.charAt(i));
            else 
                return false;
        }
        return node.isLeaf;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
       TrieNode node=root;
        for(int i=0;i<prefix.length();i++){
            Map<Character,TrieNode> map=node.map;
            if(map.containsKey(prefix.charAt(i)))
                 node=map.get(prefix.charAt(i));
            else 
                return false;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */