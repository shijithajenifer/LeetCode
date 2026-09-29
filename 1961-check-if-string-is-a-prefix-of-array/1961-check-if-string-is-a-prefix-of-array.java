class Solution {
    public boolean isPrefixString(String s, String[] words) {

        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            sb.append(word);
            String current = sb.toString();
            
            // If the concatenated string matches s, return true
            if (current.equals(s)) {
                return true;
            }
            
            // If it becomes longer than s, it can never match
            if (current.length() > s.length()) {
                return false;
            }
        }
        
        return false;
    }
}