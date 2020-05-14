class Trie {
HashSet<String> hs;
    /** Initialize your data structure here. */
    public Trie() {
        hs = new HashSet<String>();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        hs.add(word);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(hs.contains(word)){
            return true;
        }
        return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for(String key : hs){
            //System.out.println(key.substring(0,prefix.length()));
            if(prefix.length() <= key.length() && prefix.equals(key.substring(0,prefix.length()))){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
