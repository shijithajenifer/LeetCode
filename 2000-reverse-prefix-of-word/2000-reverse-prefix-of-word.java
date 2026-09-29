class Solution {
    public String reversePrefix(String word, char ch) {

        int index = word.indexOf(ch);
        
        // If the character is not found, return the original word
        if (index == -1) {
            return word;
        }
        
        // Reverse the prefix up to the index (inclusive) and append the rest
        StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
        sb.reverse();
        sb.append(word.substring(index + 1));
        
        return sb.toString();
    }
}
