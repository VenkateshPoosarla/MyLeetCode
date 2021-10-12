class Solution {
    public boolean differByOne(String[] dict) {

            if (dict == null || dict.length < 2) {
                return false;
            }

            Set<String> set;
            for (int i = 0; i < dict[0].length(); i++) {
                set = new HashSet<>();
                for (String word : dict) {
                    if (!set.add(word.substring(0, i) + word.substring(i + 1))) {
                        return true;
                    }
                }
            }

            return false;
        }
}