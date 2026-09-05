class Solution {
    public void duplicateZeros(int[] arr) {

        int possibleZeros = 0;
        int length = arr.length - 1;

        // First pass: Find the number of zeros to duplicate within bounds
        for (int left = 0; left <= length - possibleZeros; left++) {
            if (arr[left] == 0) {
                // Edge case: zero at the boundary that cannot be duplicated fully
                if (left == length - possibleZeros) {
                    arr[length] = 0; // Copy zero without duplication
                    length -= 1;
                    break;
                }
                possibleZeros++;
            }
        }

        // Second pass: Copy elements backwards from the end
        int last = length - possibleZeros;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleZeros] = 0;
                possibleZeros--;
                arr[i + possibleZeros] = 0;
            } else {
                arr[i + possibleZeros] = arr[i];
            }
        }
    }
}
