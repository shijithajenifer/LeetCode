class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        int totalPairs = 0;
        // Since values are between 1 and 9, we can store frequencies 
        // in a fixed-size array using a canonical representation (min * 10 + max).
        int[] freq = new int[100];
        
        for (int[] d : dominoes) {
            int min = Math.min(d[0], d[1]);
            int max = Math.max(d[0], d[1]);
            int canonicalValue = min * 10 + max;
            
            // Add the number of previously seen identical dominoes to our total
            totalPairs += freq[canonicalValue];
            // Increment the count for this canonical domino
            freq[canonicalValue]++;
        }
        
        return totalPairs;
    }
}
