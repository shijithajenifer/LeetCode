class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, it becomes 0, and the carry moves to the next digit
            digits[i] = 0;
        }
        
        // If all digits were 9 (e.g., 999), we need a new array with a leading 1 (e.g., 1000)
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}