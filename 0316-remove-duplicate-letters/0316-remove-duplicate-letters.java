class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        
        // store last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            // skip if already in stack
            if (seen[curr - 'a']) continue;

            // maintain lexicographical order
            while (!stack.isEmpty() &&
                   curr < stack.peek() &&
                   lastIndex[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(curr);
            seen[curr - 'a'] = true;
        }

        // build result
        StringBuilder result = new StringBuilder();
        for (char c : stack) result.append(c);

        return result.toString();
    }
}