class Solution {
    public String reverseByType(String s) {
     
        char[] a = s.toCharArray();
        int l = 0, r = a.length - 1;

        while (l < r) {
            while (l < r && !Character.isLetter(a[l])) l++;
            while (l < r && !Character.isLetter(a[r])) r--;

            if (l < r) {
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }

        l = 0;
        r = a.length - 1;

        while (l < r) {
            while (l < r && Character.isLetter(a[l])) l++;
            while (l < r && Character.isLetter(a[r])) r--;

            if (l < r) {
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }

        return new String(a);
    }
}   
