class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int bestIndex = -1;
    }

    TrieNode root = new TrieNode();
    String[] container;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        this.container = wordsContainer;
        
        for (int i = 0; i < wordsContainer.length; i++) {
            insert(i);
        }
        
        int[] ans = new int[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }
        
        return ans;
    }

    private void insert(int index) {
        String word = container[index];
        TrieNode curr = root;
        
        updateBest(curr, index);
        
        for (int i = word.length() - 1; i >= 0; i--) {
            int charIdx = word.charAt(i) - 'a';
            if (curr.children[charIdx] == null) {
                curr.children[charIdx] = new TrieNode();
            }
            curr = curr.children[charIdx];
            
            updateBest(curr, index);
        }
    }

    private void updateBest(TrieNode node, int index) {
        if (node.bestIndex == -1) {
            node.bestIndex = index;
            return;
        }
        
        int currBestLen = container[node.bestIndex].length();
        int newLen = container[index].length();
        
        if (newLen < currBestLen || (newLen == currBestLen && index < node.bestIndex)) {
            node.bestIndex = index;
        }
    }

    private int search(String query) {
        TrieNode curr = root;
        
        for (int i = query.length() - 1; i >= 0; i--) {
            int charIdx = query.charAt(i) - 'a';
            
            if (curr.children[charIdx] == null) {
                break;
            }
            curr = curr.children[charIdx];
        }
        
        return curr.bestIndex;
    }
}