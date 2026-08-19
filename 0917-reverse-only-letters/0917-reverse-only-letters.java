class Solution {
    public String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Skip non-letter characters from the left
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }

            // Skip non-letter characters from the right
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }

            // Swap the letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}