class Solution {
    public int lengthLongestPath(String input) {
        // Space O(N), Time O(N)
        String[] entries = input.split("\n");
        int[] lengthTillLevel = new int[entries.length];
        
        int maxLen = 0;
        // Time O(N)
        for (String entry : entries) {
            // Level 0 means no \t 
            int level = entry.lastIndexOf('\t') + 1;
            // calculate the abs length till the current entry
            // previous level length + full entry length - the length of \t
            int currLen = (level > 0 ? lengthTillLevel[level - 1] + 1 : 0) + entry.length() - level;
            // update the lengthTillLevel array with currLen
            lengthTillLevel[level] = currLen;
            if (entry.contains(".")) {
                // This is a file entry
                maxLen = Math.max(maxLen, currLen);
            }
        }return maxLen;
}}