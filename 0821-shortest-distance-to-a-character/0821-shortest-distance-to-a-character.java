class Solution {
    public int[] shortestToChar(String s, char c) {

        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            int min = Integer.MAX_VALUE;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == c) {

                    int distance = Math.abs(i - j);

                    if (distance < min) {
                        min = distance;
                    }
                }
            }

            answer[i] = min;
        }

        return answer;
    }
}