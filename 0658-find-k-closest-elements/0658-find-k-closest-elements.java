class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int left = 0;
        int right = arr.length - k;

        // Binary search to find the start index of the k-element window
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare distances from x to arr[mid] and arr[mid + k]
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Collect the k elements starting from index 'left'
        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
